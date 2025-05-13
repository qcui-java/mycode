import java.util.HashMap;
import java.util.Map;

public class MainExThree {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("Value for key 2: " + map.get(2));
    }
}

