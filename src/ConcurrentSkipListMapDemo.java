import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        // 1. Create a ConcurrentSkipListMap (thread-safe and sorted)
        ConcurrentSkipListMap<Integer, String> scores = new ConcurrentSkipListMap<>();

        // 2. Add elements in random order
        scores.put(85, "Alice");
        scores.put(95, "Bob");
        scores.put(70, "Charlie");
        scores.put(90, "David");

        // 3. Elements are maintained in sorted key order
        System.out.println("Sorted Entries:");
        for (Map.Entry<Integer, String> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. Navigational Queries
        System.out.println("\nLowest Score: " + scores.firstKey()); // 70
        System.out.println("Highest Score: " + scores.lastKey());  // 95
        System.out.println("Score >= 80: " + scores.ceilingKey(80)); // 85
    }
}