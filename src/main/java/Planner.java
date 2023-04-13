package main.java;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
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
        displayMenu();
    }

    private static void addMeal() throws IOException {
        AddMeal addMeal = new AddMeal();
        Meal meal = new Meal();

        addMeal.addMeal(meal);

        Gson gson = new Gson();
        String json = gson.toJson(meal);

        String fileName = meal.getName() + ".json";
        String projectDir = getProjectDirectory();
        String filePath = projectDir + "\\src\\main\\java\\meals\\" + fileName;
        FileWriter writer = new FileWriter(filePath);
        writer.write(json);
        writer.close();
    }

    private static void editMeal() {

    }

    private static void generatePlan() {
        GeneratePlan generatePlan = new GeneratePlan();
        generatePlan.createMealList();
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