import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        // 1. Create a Hashtable
        Hashtable<String, Integer> table = new Hashtable<>();

        // 2. Add elements
        table.put("A", 100);
        table.put("B", 200);

        // 3. Attempting to insert null key or value throws NullPointerException
        try {
            table.put(null, 300); // Throws NPE!
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: Null key is strictly not allowed!");
        }

        try {
            table.put("C", null); // Throws NPE!
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: Null value is strictly not allowed!");
        }

        System.out.println("Hashtable contents: " + table);
    }
}