package featureObjects;

import objects.Meal;

import java.util.Scanner;

public class AddMeal {

    public void setMealName(Meal meal) {
        System.out.println("Setting meal name:");
        Scanner scanner = new Scanner(System.in);
        meal.setName(scanner.nextLine());
    }

    public void setMealLink(Meal meal) {
        System.out.println("Setting recipe link:");
        Scanner scanner = new Scanner(System.in);
        meal.setLink(scanner.nextLine());
    }

    public void setMealRating(Meal meal) {
        System.out.println("Setting meal rating:");
        Scanner scanner = new Scanner(System.in);
        meal.setRating(scanner.nextLine());
    }

}
