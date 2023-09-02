package Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstNonRepeatedCharWithStream {
    public static void main(String[] args) {
        String input = "programming";

        Optional<Character> firstNonRepeatedChar = Optional.empty();

        if (firstNonRepeatedChar.isPresent()) {
            System.out.println("First Non-Repeated Character: " + firstNonRepeatedChar.get());
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}


