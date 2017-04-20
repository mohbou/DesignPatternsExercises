package main.strategyPattern.example2;

public class Gun implements Weapon {
    @Override
    public void fire() {
        System.out.println("firing a gun");
    }
}
