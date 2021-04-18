package func.practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {

    static class Container<T> {
        T contents;
    }

    public static void main(String[] args) {

        Container<String> container1 = new Container<>();
        container1.contents = "wow";
        Container<Double> container2 = new Container<>();
        container2.contents = 3.1415926;
        Container<Character> container3 = new Container<>();
        container3.contents = 'd';
        Container<Double> container4 = new Container<>();
        container4.contents = 6.28;
        Container<Double> container5 = new Container<>();
        container5.contents = 2.781;

        List<Container> containers = new ArrayList<Container>();
        containers.add(container1);
        containers.add(container2);
        containers.add(container3);
        containers.add(container4);
        containers.add(container5);

        containers.stream().filter(e -> e.contents instanceof String).map(e -> e.contents).forEach(System.out::println); // for eachs and filters I understand, map and reduce less so

        // I'm weird: I actually find it easier to read written as a one-liner.
        System.out.println("\nNumbers in Containers: ");
        containers.stream().filter(e -> e.contents instanceof Number).map(e ->e.contents).forEach(System.out::println);

        System.out.println();
        long numberOfNumbers = containers.stream().map(e -> e.contents).filter(e -> e instanceof Number).count();
        double sum = containers.stream().filter(e -> e.contents instanceof Number).map(e -> (Double) e.contents).reduce(0.0, (a,b) -> {return a + b;});  // map performs a transformation in the mathematical understanding of a mapping
        System.out.println("Sum: " + sum);
        double average = containers.stream().filter(e -> e.contents instanceof Number).map(e -> (Double) e.contents).reduce(0.0, (a,b) -> {return a + b / numberOfNumbers;});  // reduce 'reduces' a stream of variables into 1 output.
        System.out.println("Average: " + average);

    }


}
