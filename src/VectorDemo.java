import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // 1. Create a Vector to store Strings
        // Vector is like a dynamic array that grows automatically as needed
        Vector<String> animals = new Vector<>();

        // 2. Add elements to the Vector
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Lion");

        // 3. Access elements by index (0-based)
        System.out.println("First animal: " + animals.get(0));

        // 4. Remove an element
        animals.remove("Cat"); // Removes "Cat" from the vector

        // 5. Check the current size and capacity
        System.out.println("Number of elements: " + animals.size());

        // 6. Print all elements using a simple loop
        System.out.println("\nAll animals in the Vector:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}