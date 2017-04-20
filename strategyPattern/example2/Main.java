package main.strategyPattern.example2;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        gamer.switchWeapon(new Gun());
        gamer.fire();
        gamer.switchWeapon(new Sword());
        gamer.fire();
        gamer.switchWeapon(new Rocket());
        gamer.fire();
    }
}
