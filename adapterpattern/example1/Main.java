package main.adapterpattern.example1;

public class Main {

    public static void main(String[] args) {
        EnemyTank rx7 = new EnemyTank();

        EnemyRobot fredR = new EnemyRobot();

        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(fredR);


        fredR.reactHuman("Paul");
        fredR.walkForward();
        fredR.smashWithHands();

        rx7.assignDriver("Frank");
        rx7.driveForward();
        rx7.fireWeapon();



        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
