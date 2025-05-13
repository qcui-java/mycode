import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class MainExSix {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        List<String> filteredFruits = fruits.stream()
                                            .filter(fruit -> fruit.contains("a"))
                                            .sorted()
                                            .collect(Collectors.toList());

        System.out.println("Filtered and Sorted Fruits: " + filteredFruits);
    }
}

