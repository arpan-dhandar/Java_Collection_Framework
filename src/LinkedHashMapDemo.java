import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // 1. Create a LinkedHashMap (maintains insertion order by default)
        LinkedHashMap<String, Integer> fruitPrices = new LinkedHashMap<>();

        // 2. Add elements using put()
        fruitPrices.put("Apple", 120);
        fruitPrices.put("Banana", 40);
        fruitPrices.put("Mango", 80);
        fruitPrices.put("Orange", 60);

        // 3. Update an existing key (order does not change, only the value does)
        fruitPrices.put("Banana", 45);

        // 4. Access an element
        System.out.println("Price of Mango: " + fruitPrices.get("Mango"));

        // 5. Remove an element
        fruitPrices.remove("Orange");

        // 6. Iterate through entries (guaranteed to print in the exact insertion order)
        System.out.println("\nFruits and Prices (in insertion order):");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 7. Check size
        System.out.println("\nTotal Items: " + fruitPrices.size());
    }
}