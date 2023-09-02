package coding3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElementWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 7, 1, 8, 3, 9, 4, 6);

        Optional<Integer> firstElement = numbers.stream().findFirst();
        
       

        if (firstElement.isPresent()) {
            System.out.println("First Element: " + firstElement.get());
        } else {
            System.out.println("List is empty.");
        }
        
       
    }
}
