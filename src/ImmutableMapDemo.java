import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        // Up to 10 entries using Map.of()
        Map<String, Integer> scores = Map.of(
                "Alice", 95,
                "Bob", 88,
                "Charlie", 72
        );

        System.out.println("Map: " + scores);

        // Attempting to modify will throw UnsupportedOperationException
        scores.put("David", 90); // Crashes at runtime!
    }
}