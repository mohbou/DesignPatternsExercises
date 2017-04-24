package main.bridgepattern.example3;

public class FlyingCharacters extends Flyable {
    private int x, y;

    public FlyingCharacters(int x, int y, Bird bird){
        super(bird);
        this.x = x;
        this.y = y;
    }

    public void tweet(){
        bird.makeSound();
    }

    public void move(int x, int y){
        bird.gotoPosition(x, y);
        this.x = x;
        this.y = y;
    }
}