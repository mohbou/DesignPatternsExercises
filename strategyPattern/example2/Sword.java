package main.strategyPattern.example2;

public class Sword implements Weapon {
    @Override
    public void fire() {
        System.out.println("using a sword");
    }
}
