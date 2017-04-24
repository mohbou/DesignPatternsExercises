package main.bridgepattern.example3;

public class Duck implements Bird {
    private String type;
    private int positionX;
    private int positionY;

    public Duck(String type){
        this.type = type;
    }

    @Override
    public void gotoPosition(int x, int y){
        System.out.println("Duck is moving to position (" + x + "," + y + ")");
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void makeSound(){
        System.out.println("Quack Quack ....");
    }
}