package main.java;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Meal {
    public String name;
    public String link;
    public String rating;
}
