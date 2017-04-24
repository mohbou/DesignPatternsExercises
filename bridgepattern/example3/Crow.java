package main.bridgepattern.example3;

public class Crow implements Bird {
    private String type;
    private int positionX;
    private int positionY;

    public Crow(String type){
        this.type = type;
    }

    @Override
    public void gotoPosition(int x, int y){
        System.out.println("Crow is moving to position (" + x + "," + y + ")");
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void makeSound(){
        System.out.println("Caw Caw ....");
    }
}