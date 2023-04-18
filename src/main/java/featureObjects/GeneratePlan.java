package featureObjects;

import objects.Ingredient;
import objects.Meal;

import java.io.IOException;
import java.util.Random;

public class GeneratePlan extends Helper {

    public GeneratePlan() throws IOException {
        meals = createMealList();
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