package main.strategyPattern.example1;

public class Animal {
    public Flys flys;

    public void setFlysAbility(Flys flys) {
        this.flys =flys;
    }

    public void trytoFly() {

        flys.flys();
    }
}
