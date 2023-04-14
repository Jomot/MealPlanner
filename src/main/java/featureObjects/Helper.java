package featureObjects;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Helper {

    protected ObjectMapper mapper = new ObjectMapper();

    public static String getProjectDirectory() {
        return System.getProperty("user.dir");
    }

    public static String getMealsFilePath() {
        return getProjectDirectory() + "\\src\\main\\java\\" + "test.json";
    }
}
