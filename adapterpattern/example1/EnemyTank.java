package main.adapterpattern.example1;

public class EnemyTank implements EnemyAttacker {
    @Override
    public void fireWeapon() {
        System.out.println("firing Tank.....");
    }

    @Override
    public void driveForward() {
        System.out.println("Tank drive forward.....");
    }

    @Override
    public void assignDriver(String name) {
        System.out.println(name + " driving the tank");
    }
}
