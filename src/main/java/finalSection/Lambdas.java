package finalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Integer number = null;
        int counter = 0; // cannot be null for a primitive

        // Lambda = "name ->" , 'name' is the argument
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if (name.isEmpty()) {throw new IllegalArgumentException("");}

            // Adding the following code is 'wrong' in the conception that it is no longer PURE functional programming
            // As it is no stateful
            if (counter == 0) {
                return String.valueOf(counter);
            }

            return name.toUpperCase();
        };

        String upperCasedName = upperCaseName.apply("Alex", 20);
    }
}
