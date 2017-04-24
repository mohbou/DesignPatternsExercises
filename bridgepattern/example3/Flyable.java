package main.bridgepattern.example3;

public abstract class Flyable {
    protected Bird bird;

    protected Flyable(Bird bird){
        this.bird = bird;
    }

    public abstract void tweet();
    public abstract void move(int x, int y);
}