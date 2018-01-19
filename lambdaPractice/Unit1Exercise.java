package main.lambdaPractice;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;


public class Unit1Exercise {

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

        sortList(people);
        printList(people);
        System.out.println("---------------------------");
        peopleWithFirstNameC(people);
        System.out.println("---------------------------");
        printSome(people,(p)->p.getFirstName().startsWith("R"));

    }

    //sort by Last Name
    public static void sortList(List<Person> list) {
        Collections.sort(list, (o1,o2) -> o1.getLastName().compareTo(o2.getLastName()));

    }

    //print all element of list
    public static void printList(List<Person> list) {
        for(Person p:list) {
            System.out.println(p);
        }
    }

    //all people that has first name start with C
    public static void peopleWithFirstNameC(List<Person> list) {
        for(Person p:list) {
            if(p.getFirstName().startsWith("C")) {
                System.out.println(p);
            }
        }
    }

    //improve method of peopleWithFirstNameC with general behaviour for condition
    public static void printSome(List<Person> people, Condition condition) {
        for(Person p:people) {
            if(condition.test(p)) {
                System.out.println(p);
            }
    }


}
}
    interface Condition {
        boolean test(Person p);
    }