package featureObjects;

import objects.Ingredient;
import objects.Meal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddMeal {
    Scanner scanner = new Scanner(System.in);

    public void setName(Meal meal) {
        System.out.println("Setting meal name:");
        meal.setName(scanner.nextLine());
    }

    public void setIngredients(Meal meal) {
        System.out.println("Setting meal ingredients");
        System.out.println("***** Enter 'Done' to finish ingredients *****");
        List<Ingredient> ingredients = new ArrayList<>();
        String name = "";
        while (!name.equals("Done")) {
            Ingredient ingredient = new Ingredient();
            System.out.println("Ingredient: ");
            name = scanner.nextLine();
            if (!name.equals("Done")) {
                ingredient.setName(name);
                System.out.println("Quantity: ");
                ingredient.setQuantity(scanner.nextLine());
                ingredients.add(ingredient);            }
        }
        meal.setIngredients(ingredients);
    }

    public void setLink(Meal meal) {
        System.out.println("Setting recipe link:");
        meal.setLink(scanner.nextLine());
    }

    public void setRating(Meal meal) {
        System.out.println("Setting meal rating:");
        meal.setRating(scanner.nextLine());
    }

}
