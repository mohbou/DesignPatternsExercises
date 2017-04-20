package main.strategyPattern.example1;

public class CantFlys implements Flys {
    @Override
    public void flys() {
        System.out.println("Cannot fly");
    }
}
