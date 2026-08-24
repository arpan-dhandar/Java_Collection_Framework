import java.util.Map;
import java.util.WeakHashMap;

// Custom Key class
class Key {
    String name;

    public Key(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // 1. Create a WeakHashMap
        Map<Key, String> map = new WeakHashMap<>();

        // 2. Create two strong key references
        Key key1 = new Key("Session_1");
        Key key2 = new Key("Session_2");

        // 3. Put entries into the map
        map.put(key1, "Active User Data 1");
        map.put(key2, "Active User Data 2");

        System.out.println("Before GC: " + map);

        // 4. Nullify key1 (now key1 has NO strong reference outside the map)
        key1 = null;

        // 5. Suggest the Garbage Collector to run
        System.gc();

        // Give the JVM a moment to complete GC cleanup
        Thread.sleep(100);

        // 6. Check the map again: entry for key1 is automatically gone!
        System.out.println("After GC:  " + map);
    }
}