import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {

        // 1. HashSet -> no order guaranteed
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple");   // duplicate -> ignored
        System.out.println("HashSet: " + hashSet);

        // 2. LinkedHashSet -> maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");   // duplicate -> ignored
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 3. TreeSet -> sorted order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Apple");   // duplicate -> ignored
        System.out.println("TreeSet: " + treeSet);

        // 4. Common methods
        System.out.println("\n--- Common Methods on HashSet ---");
        System.out.println("Contains 'Apple'? " + hashSet.contains("Apple"));
        System.out.println("Size: " + hashSet.size());

        hashSet.remove("Mango");
        System.out.println("After removing Mango: " + hashSet);

        // 5. Looping using for-each
        System.out.println("\n--- Loop using for-each ---");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // 6. Looping using Iterator
        System.out.println("\n--- Loop using Iterator ---");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 7. isEmpty and clear
        System.out.println("\nIs hashSet empty? " + hashSet.isEmpty());
        hashSet.clear();
        System.out.println("After clear(): " + hashSet);
        System.out.println("Is hashSet empty now? " + hashSet.isEmpty());
    }
}