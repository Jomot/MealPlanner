package featureObjects;

import com.fasterxml.jackson.core.type.TypeReference;
import objects.Ingredient;
import objects.Meal;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class GeneratePlan extends Helper {

    private final List<Meal> meals;
    public GeneratePlan() throws IOException {
        meals = createMealList();
    }

    @SuppressWarnings("unchecked")
    public List<Meal> createMealList() throws IOException {
        File file = new File(getMealsFilePath());
        List<Object> jsonArray = mapper.readValue(file, List.class);
        String jsonString = mapper.writeValueAsString(jsonArray);
        return mapper.readValue(jsonString, new TypeReference<List<Meal>>(){});
    }

    public Meal getRandomMealFromList() {
        Random random = new Random();
        int index = random.nextInt(meals.size());
        return meals.get(index);
    }

    public void outputIngredients(Meal meal) {
        log("Meal: " + meal.getName());
        log("Ingredients: ");
        for (Ingredient ingredient : meal.getIngredients()) {
            log("- " + ingredient.getName() + " " + ingredient.getQuantity());
        }
        log("\n");
    }

    public Meal rollAgain(Meal meal) {
        log("Roll again? Enter \"Yes\" or \"No\" :");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            meal = getRandomMealFromList();
            outputIngredients(meal);
            rollAgain(meal);
        }
        return meal;
    }

    public void displayLink(Meal meal) {
        if (meal.getLink() != null) {
            System.out.println(meal.getLink());
        }
    }
}