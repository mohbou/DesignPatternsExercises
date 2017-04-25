package main.prototypepattern.example1;

public class Main {

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep();

        Sheep sheep2 = (Sheep)sheep1.makeCopy();

        System.out.println("Hascode sheep1 "+System.identityHashCode(sheep1.hashCode()));
        System.out.println("Hascode sheep2 "+System.identityHashCode(sheep2.hashCode()));

    }
}
