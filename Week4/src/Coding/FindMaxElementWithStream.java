package Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxElementWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 7, 1, 8, 3, 9, 4, 6);

        Optional<Integer> maxElement = numbers.stream().max(Integer::compareTo);

        if (maxElement.isPresent()) {
            System.out.println("Maximum Element: " + maxElement.get());
        } else {
            System.out.println("List is empty.");
        }
    }
}
