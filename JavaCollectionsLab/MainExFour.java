import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public class MainExFour {
    public static <T> void printCollection(Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        printCollection(fruits);
    }
}

