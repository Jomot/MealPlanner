import featureObjects.AddMeal;
import featureObjects.GeneratePlan;
import featureObjects.Helper;
import objects.Meal;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Planner extends Helper {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner scanner = new Scanner(System.in);
        displayMenu();
        switch (scanner.nextInt()) {
            case 1 -> generatePlan();
            case 2 -> addMeal();
            case 3 -> editMeal();
            default -> throw new ParseException("Invalid option entered", 0);
        }
        // TODO: 15/04/2023 allow user to make another choice before ending
        displayMenu();
    }

    private static void addMeal() throws IOException {
        AddMeal addMeal = new AddMeal();

        List<Meal> mealObjects = convertMealsJsonToList();
        Meal meal = new Meal();
        addMeal.setName(meal);
        addMeal.setIngredients(meal);
        addMeal.setLink(meal);
        addMeal.setRating(meal);
        mealObjects.add(meal);
        writeObjectToFile(mealObjects);

        displayMenu();
    }

    private static void editMeal() {

    }

    private static void generatePlan() throws IOException {
        GeneratePlan generatePlan = new GeneratePlan();
        Meal meal;
        meal = generatePlan.getRandomMealFromList();
        generatePlan.outputIngredients(meal);
        meal = generatePlan.rollAgain(meal);
        generatePlan.displayLink(meal);
    }

    private static void displayMenu() {
        System.out.println("--------Menu--------");
        System.out.println("-- 1 - Plan Meal ---");
        System.out.println("-- 2 - Add Meal ----");
        System.out.println("-- 3 - Edit Meals --");
        System.out.println("--------------------");
        System.out.println("Enter:");
    }
}