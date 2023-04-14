package objects;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Meal {
    public String name;
    public List<Ingredient> ingredients;
    public String link;
    public String rating;
}
