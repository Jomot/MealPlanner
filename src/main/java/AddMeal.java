package main.java;

import java.util.Scanner;

public class AddMeal {

    public void addMeal(Meal meal) {
        System.out.println("Adding meal");
        setMealName(meal);
        setMealLink(meal);
        setMealRating(meal);
    }

    private void setMealName(Meal meal) {
        System.out.println("Setting meal name:");
        Scanner scanner = new Scanner(System.in);
        meal.setName(scanner.nextLine());
    }

    private void setMealLink(Meal meal) {
        System.out.println("Setting recipe link:");
        Scanner scanner = new Scanner(System.in);
        meal.setLink(scanner.nextLine());
    }

    private void setMealRating(Meal meal) {
        System.out.println("Setting meal rating:");
        Scanner scanner = new Scanner(System.in);
        meal.setRating(scanner.nextLine());
    }

}
