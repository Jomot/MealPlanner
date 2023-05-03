import featureObjects.AddMeal;
import featureObjects.GeneratePlan;
import featureObjects.Helper;
import featureObjects.Select;
import objects.Meal;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Planner extends Helper {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        displayMenu();
        acceptMenuInput();
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
    }

    private static void selectMeal() throws IOException {
        Select select = new Select();
        select.displayMeals();
        Meal selectedMeal = select.selectMeal();
        select.displaySelectedMealIngredients(selectedMeal);
    }

    private static void editMeal() throws IOException {
        System.out.println("Functionality coming soon...");
        displayMenu();
        acceptMenuInput();
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
        System.out.println("-- 3 - Select Meal -");
        System.out.println("-- 4 - Edit Meals --");
        System.out.println("-- 5 - Exit --------");
        System.out.println("--------------------");
        System.out.println("Enter:");
    }

    private static void acceptMenuInput() throws IOException {
        switch (scanner.nextInt()) {
            case 1 -> generatePlan();
            case 2 -> {
                addMeal();
                displayMenu();
                acceptMenuInput();
            }
            case 3 -> selectMeal();
            case 4 -> editMeal();
            case 5 -> {}
            default -> {
                System.out.println("Invalid option entered");
                displayMenu();
                acceptMenuInput();
            }
        }
    }
}