package main.strategyPattern.example2;

public class Rocket implements Weapon {
    @Override
    public void fire() {
        System.out.println(" firing a rocket");
    }
}
