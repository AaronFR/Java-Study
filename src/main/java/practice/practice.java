package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class practice {

    public static void main(String[] args) {
        String[] theArray = {
                "Larry",
                "dave",
                "Jimmet ",
                "Jimmed jim Jimth of his name",
                "xoypt"
        };
        Set<String> theSet = new HashSet<>(Arrays.asList(theArray));

        System.out.println("Starts with capital letter: ");
        theSet.stream()
                .filter(e -> e.matches("[A-Z].*"))
                .forEach(System.out::println);

        System.out.println("\nContains more than one word");
        theSet.stream()
                .filter(e -> e.matches("\\b.*\\b \\b.*\\b"))
                .forEach(System.out::println);
    }
}
