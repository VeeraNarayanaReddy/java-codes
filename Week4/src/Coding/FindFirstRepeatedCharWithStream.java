package Coding;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FindFirstRepeatedCharWithStream {
    public static void main(String[] args) {
        String input = "programming";

        Optional<Character> firstRepeatedChar = Optional.empty();

        if (firstRepeatedChar.isPresent()) {
            System.out.println("First Repeated Character: " + firstRepeatedChar.get());
        } else {
            System.out.println("No repeated character found.");
        }
    }
}
