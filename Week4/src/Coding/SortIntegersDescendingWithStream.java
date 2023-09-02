package Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegersDescendingWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 7, 1, 8, 3, 9, 4, 6);

        List<Integer> sortedDescendingNumbers = numbers.stream()
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .collect(Collectors.toList());

        System.out.println("Sorted Numbers (Descending): " + sortedDescendingNumbers);
    }
}
