import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // 1. Obtain the iterator
        Iterator<String> it = fruits.iterator();

        // 2. Traverse and modify safely
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println("Current: " + fruit);

            // Safe removal during traversal
            if (fruit.equals("Banana")) {
                it.remove(); // Safely removes "Banana"
            }
        }

        System.out.println("\nList after safe removal: " + fruits);
    }
}