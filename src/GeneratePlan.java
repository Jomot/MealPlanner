import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratePlan extends Helper {

    public void createMealList() {
        String projectDir = getProjectDirectory();
        String folderPath = projectDir + "\\src\\Meals\\";

        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        List<String> fileNames = new ArrayList<>();

        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName().replace(".json", "");
                fileNames.add(fileName);
            }
        }
    }
}
