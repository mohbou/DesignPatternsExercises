package main.bridgepattern.example3;

public class FlyingBirds {
    public static void main(String[] args) {
        Flyable duck = new FlyingCharacters(0, 0, new Duck("Duck"));
        Flyable crow = new FlyingCharacters(0, 0, new Crow("Crow"));
        System.out.println("Moving Birds");
        for(int i = 1; i < 5; i++){
            // Moving Duck
            duck.move(3*i, 3*i);
            // Moving Crow
            crow.move(4*i,  4*i);
            // Produce sound
            duck.tweet();
            crow.tweet();
            System.out.println("----------------------");
        }
    }
}