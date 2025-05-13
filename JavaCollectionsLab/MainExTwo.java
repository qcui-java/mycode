import java.util.HashSet;
import java.util.Set;

public class MainExTwo {
    public static void main(String[] args) {
        Set<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        animals.remove("Cat");

        System.out.println("Animals: " + animals);
    }
}

