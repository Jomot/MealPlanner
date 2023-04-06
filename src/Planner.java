import java.text.ParseException;
import java.util.Scanner;

public class Planner {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        displayMenu();
        switch (scanner.nextInt()) {
            case 0 -> addMeal();
            case 1 -> editMeal();
            case 2 -> generatePlan();
            default -> throw new ParseException("Invalid option entered", 0);
        }
    }

    private static void addMeal() {

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