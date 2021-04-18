package func.imperative;

import static func.imperative.main.Gender.FEMALE;
import static func.imperative.main.Gender.MALE;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class main {

  public static void main(String[] args) {

    // ToDo: This should go in another directory

    List<Person> people = new ArrayList<Person>();

    people.add(new Person("John", MALE));
    people.add(new Person("Nancy", FEMALE));
    people.add(new Person("John", MALE));
    people.add(new Person("Betty", FEMALE));
    people.add(new Person("Betty II", FEMALE));

    // Imperative Approach
    System.out.println("Imperative Approach");

    List<Person> females = new ArrayList<>();

    for (Person person : people) {
      if (FEMALE.equals(person.gender)) {
        females.add(person);
      }
    }

    for (Person female : females) {
      System.out.println(female.name);
    }

    // Declarative Approach
    System.out.println("\nDeclarative approach");

    people.stream()
        .filter(person -> FEMALE.equals(person.gender))
        .map(person -> person.name)
        .forEach(System.out::println);

    Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
    people.stream()
        .filter(personPredicate)
        .map(lambda -> lambda.name)
        .forEach(System.out::print);

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
