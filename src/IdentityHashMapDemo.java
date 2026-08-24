import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        // Create two separate String objects with the exact same text
        String key1 = new String("Java");
        String key2 = new String("Java");

        // ---------------- 1. Standard HashMap Behavior ----------------
        // Uses .equals() -> Sees key1 and key2 as identical content -> Overwrites value
        Map<String, String> standardMap = new HashMap<>();
        standardMap.put(key1, "Version 8");
        standardMap.put(key2, "Version 21");

        System.out.println("--- Standard HashMap ---");
        System.out.println("Size: " + standardMap.size()); // Size is 1
        System.out.println("Contents: " + standardMap);

        // ---------------- 2. IdentityHashMap Behavior ----------------
        // Uses == (memory reference) -> Sees key1 and key2 as separate instances -> Keeps both
        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put(key1, "Version 8");
        identityMap.put(key2, "Version 21");

        System.out.println("\n--- IdentityHashMap ---");
        System.out.println("Size: " + identityMap.size()); // Size is 2
        System.out.println("Contents: " + identityMap);
    }
}