package featureObjects;

import com.fasterxml.jackson.core.type.TypeReference;
import objects.Meal;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GeneratePlan extends Helper {

    public List<Meal> createMealList() throws IOException {
        File file = new File(getMealsFilePath());
        List<Object> jsonArray = mapper.readValue(file, List.class);
        String jsonString = mapper.writeValueAsString(jsonArray);
        return mapper.readValue(jsonString, new TypeReference<List<Meal>>(){});
    }

    public Meal getRandomMealFromList(List<Meal> meals) {

        return null;
    }
}