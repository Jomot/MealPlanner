package featureObjects;

import objects.Ingredient;
import objects.Meal;

import java.util.ArrayList;
import java.util.List;

public class AddMeal extends Helper {

    public void setName(Meal meal) {
        log("Setting meal name:");
        meal.setName(scanner.nextLine());
    }

    public void setIngredients(Meal meal) {
        log("Setting meal ingredients");
        log("***** Enter 'Done' to finish ingredients *****");
        List<Ingredient> ingredients = new ArrayList<>();
        String name = "";
        while (!name.equalsIgnoreCase("done")) {
            Ingredient ingredient = new Ingredient();
            log("Ingredient: ");
            name = scanner.nextLine();
            if (!name.equals("Done")) {
                ingredient.setName(name);
                log("Quantity: ");
                ingredient.setQuantity(scanner.nextLine());
                ingredients.add(ingredient);            }
        }
        meal.setIngredients(ingredients);
    }

    public void setLink(Meal meal) {
        log("Setting recipe link:");
        meal.setLink(scanner.nextLine());
    }

    public void setRating(Meal meal) {
        log("Setting meal rating:");
        meal.setRating(scanner.nextLine());
    }

}
