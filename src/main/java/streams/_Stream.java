package streams;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();

        people.add(new Person("John", MALE));
        people.add(new Person("Nancy", FEMALE));
        people.add(new Person("John", MALE));
        people.add(new Person("Betty", FEMALE));
        people.add(new Person("Betty II", FEMALE));

        people.stream()
                .map(person -> person.name)
                .mapToDouble(String::length)
                .forEach(System.out::println);

        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = x -> System.out.println(x);

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);

        // Spacing
        System.out.println();

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        System.out.println(
                people.stream()
                .allMatch(person -> FEMALE.equals(person.gender))
        );

        System.out.println(containsOnlyFemales);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
