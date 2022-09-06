import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Dog extends Animal {

    private String dogName;
    private String verb;
    private String dogFood;

    public void setName(String name) {
        dogName = name;
    }

    public void setVerb(String verbName) {
        verb = verbName;
    }

    public void setFood(String food) {
        dogFood = food;
    }

    public String getName() {
        return dogName;
    }

    public String getVerb() {
        return verb;
    }

    public String getFood() {
        return dogFood;
    }

    @Override

    public String name() {
        return dogName;
    }

    public String favourite() {
        return dogFood;
    }

}
