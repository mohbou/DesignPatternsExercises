package main.strategyPattern.example2;

public class Gamer {
    public Weapon weapon;

    public void switchWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fire() {
        weapon.fire();
    }
}
