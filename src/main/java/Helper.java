import java.io.File;

public class Helper {

    public static String getProjectDirectory() {
        return System.getProperty("user.dir");
    }

    public static String getMealsFilePath() {
        return getProjectDirectory() + "\\src\\main\\java\\meals\\" + "test.json";
    }

    public static Boolean doesFileExist() {
        String filePath = getMealsFilePath();
        File file = new File(filePath);
        return file.exists();
    }

}
