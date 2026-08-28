import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna", "Alex");

        // Goal: Find all names starting with 'A', convert to uppercase, sort them, and collect to a List
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))     // Intermediate: filter
                .map(String::toUpperCase)                 // Intermediate: transform
                .sorted()                                 // Intermediate: sort
                .collect(Collectors.toList());            // Terminal: produce List

        System.out.println("Processed names: " + result);

        // Example: Calculate sum of squares of even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumOfEvenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum(); // Terminal reduction

        System.out.println("Sum of even squares: " + sumOfEvenSquares);
    }
}