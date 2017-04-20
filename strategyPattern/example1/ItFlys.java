package main.strategyPattern.example1;

public class ItFlys implements Flys {
    @Override
    public void flys() {
        System.out.println("It can fly");
    }
}
