package Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegersWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 7, 1, 8, 3, 9, 4, 6);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}

