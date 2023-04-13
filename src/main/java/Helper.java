public class Helper {

    public static String getProjectDirectory() {
        return System.getProperty("user.dir");
    }

    public static String getMealsFilePath() {
        return getProjectDirectory() + "\\src\\main\\java\\" + "test.json";
    }
}
