package main.lambdaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamPractise
{

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Tom", "Love", 60),
                new Person("Mario", "Ramirez", 60),
                new Person("Sergio", "Torio", 60),
                new Person("Helen", "Cagger", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );

         people.stream()
                .filter(p -> p.getFirstName().startsWith("L"))
                .forEach(person -> System.out.println(person))  ;


    }
}
