import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 1. Define a simple class to hold data
class Student {
    String name;
    int mark;

    // Constructor to initialize student objects
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    // toString method to print the student object easily
    @Override
    public String toString() {
        return name + " - " + mark;
    }
}

// 2. Create a custom Comparator class by implementing Comparator<Student>
class StudentComparator implements Comparator<Student> {

    // Overriding the compare method defines how two Student objects are compared
    @Override
    public int compare(Student s1, Student s2) {
        // Compare by marks in descending order (highest score first)
        // Integer.compare(s2, s1) results in descending order
        int markComparison = Integer.compare(s2.mark, s1.mark);

        // If marks are different, return the mark comparison result
        if (markComparison != 0) {
            return markComparison;
        }

        // If marks are identical (tie), sort by name alphabetically (ascending)
        return s1.name.compareTo(s2.name);
    }
}

// Main class updated to match your required file name
public class ComparatorDemo {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 85));
        students.add(new Student("David", 78));

        System.out.println("--- Before Sorting ---");
        for (Student s : students) {
            System.out.println(s);
        }

        // 3. Sort the list using our custom Comparator
        Collections.sort(students, new StudentComparator());

        System.out.println("\n--- After Sorting (By Mark Descending, Name Ascending) ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}