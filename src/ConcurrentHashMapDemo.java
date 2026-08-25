import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add items safely
        map.put("Java", 100);
        map.put("Python", 80);

        // Atomic compute-if-absent (thread-safe one-liner)
        map.putIfAbsent("C++", 90);

        System.out.println("Map contents: " + map);
    }
}
