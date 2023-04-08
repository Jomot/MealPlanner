import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Planner {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner scanner = new Scanner(System.in);
        displayMenu();
        switch (scanner.nextInt()) {
            case 1 -> addMeal();
            case 2 -> editMeal();
            case 3 -> generatePlan();
            default -> throw new ParseException("Invalid option entered", 0);
        }
    }

    private static void addMeal() throws IOException {
        AddMeal addMeal = new AddMeal();
        Meal meal = new Meal();

        addMeal.addMeal(meal);

        Gson gson = new Gson();
        String json = gson.toJson(meal);

        String fileName = meal.getName() + ".json";
        FileWriter writer = new FileWriter(fileName);
        writer.write(json);
        writer.close();
    }

    private static void editMeal() {

    }

    private static void generatePlan() {

    }

    private static void displayMenu() {
        System.out.println("--------Menu--------");
        System.out.println("-- 1 - Add Meal ----");
        System.out.println("-- 2 - Edit Meal ---");
        System.out.println("-- 3 - Plan Meals --");
        System.out.println("--------------------");
        System.out.println("Enter:");

    }
}