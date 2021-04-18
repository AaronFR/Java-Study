package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class main {

    public static void main(String[] args) {

        Supplier<IllegalStateException> exceptionOne = () -> new IllegalStateException(
                "AGHGAHHAHGHF");
        System.out.println(
                "BTW alt cmd v is the shortcut for extracting a variable, its pretty neat\n");

        Optional.ofNullable("Hello")
                .ifPresent(email -> System.out.println("Sending email to " + email));


    }
}
