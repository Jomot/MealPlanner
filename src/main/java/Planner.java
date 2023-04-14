import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import featureObjects.AddMeal;
import featureObjects.GeneratePlan;
import objects.Meal;

import java.io.File;
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
        displayMenu();
    }

    private static void addMeal() throws IOException {
        AddMeal addMeal = new AddMeal();

        ObjectMapper mapper = new ObjectMapper();
        String filePath = getMealsFilePath();
        File file = new File(filePath);
        List<Meal> mealObjects = mapper.readValue(file, new TypeReference<>() {
        });

        Meal meal = new Meal();
        addMeal.setName(meal);
        addMeal.setIngredients(meal);
        addMeal.setLink(meal);
        addMeal.setRating(meal);
        mealObjects.add(meal);

        mapper.writeValue(file, mealObjects);
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