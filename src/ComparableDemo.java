import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. Renamed to ComparableStudent to avoid duplicate class conflict with ComparatorDemo
class ComparableStudent implements Comparable<ComparableStudent> {
    int rollNo;
    String name;

    // Constructor
    public ComparableStudent(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // 2. Define the natural sorting logic (Ascending order by rollNo)
    @Override
    public int compareTo(ComparableStudent other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    // 3. String representation for clean console output
    @Override
    public String toString() {
        return rollNo + " : " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        // Create the list using ComparableStudent
        List<ComparableStudent> list = new ArrayList<>();
        list.add(new ComparableStudent(103, "Charlie"));
        list.add(new ComparableStudent(101, "Alice"));
        list.add(new ComparableStudent(102, "Bob"));

        System.out.println("Before Sorting:");
        System.out.println(list);

        // Collections.sort() uses the compareTo() method automatically
        Collections.sort(list);

        System.out.println("\nAfter Sorting (Ascending by Roll No):");
        System.out.println(list);
    }
}