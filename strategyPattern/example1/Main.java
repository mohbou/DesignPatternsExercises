package main.strategyPattern.example1;

public class Main {

    public static void main(String[] args) {
        Animal doggy = new Dog();
        Animal bird = new Bird();

        doggy.trytoFly();
        bird.trytoFly();

        doggy.setFlysAbility(new ItFlys());

        doggy.trytoFly();
    }
}
