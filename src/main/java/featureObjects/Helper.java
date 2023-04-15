package featureObjects;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import objects.Meal;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Helper {

    protected static final String filePath = getMealsFilePath();
    protected static final File file = new File(filePath);
    protected static final ObjectMapper mapper = new ObjectMapper();
    protected Scanner scanner = new Scanner(System.in);

    public void log(Object obj) {
        System.out.println(obj);
    }

    public static String getProjectDirectory() {
        return System.getProperty("user.dir");
    }

    public static String getMealsFilePath() {
        return getProjectDirectory() + "\\src\\main\\java\\" + "meals.json";
    }

    public static List<Meal> convertMealsJsonToList() throws IOException {
        return mapper.readValue(file, new TypeReference<>() {
        });
    }

    public static void writeObjectToFile(List<Meal> mealObjects) throws IOException {
        mapper.writeValue(file, mealObjects);
    }
}
