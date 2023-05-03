package featureObjects;

import objects.Ingredient;
import objects.Meal;

import java.io.IOException;

public class Select extends Helper {

    public Select() throws IOException {
        meals = createMealList();
    }

    public void displayMeals() {
        for (int i=1; i <= meals.size(); i++) {
            Meal meal = meals.get(i -1);
            log("-- " + i + " - " + meal.getName());
        }
    }

    public Meal selectMeal() {
        log("Choice: ");
        int index = scanner.nextInt();
        Meal mealToUse = meals.get(index -1);
        assert mealToUse != null;
        log(mealToUse.name);
        return mealToUse;
    }

    public void displaySelectedMealIngredients(Meal meal) {
        log("Ingredients needed:");
        for (Ingredient ingredient : meal.getIngredients()) {
            log("- " + ingredient.getName() + " " + ingredient.getQuantity());
        }
    }
}
