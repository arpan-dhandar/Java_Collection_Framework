import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // 1. Create a HashMap
        // Key is String (Student Name), Value is Integer (Roll Number / Score)
        HashMap<String, Integer> studentScores = new HashMap<>();

        // 2. Add Key-Value pairs using put()
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 78);

        // 3. Updating a value: Using put() on an existing key overwrites the old value
        studentScores.put("Alice", 95); // Alice's score is updated from 90 to 95

        // 4. Access a value using get(key)
        System.out.println("Alice's Score: " + studentScores.get("Alice"));

        // 5. Check if a key or value exists
        System.out.println("Contains Bob? " + studentScores.containsKey("Bob")); // true
        System.out.println("Contains Score 100? " + studentScores.containsValue(100)); // false

        // 6. Remove a key-value pair
        studentScores.remove("Charlie");

        // 7. Loop through the HashMap using a simple for-each loop
        System.out.println("\nAll Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 8. Size of the HashMap
        System.out.println("\nTotal entries: " + studentScores.size());
    }
}