package main.adapterpattern.example1;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        System.out.println("fire weapon");
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkForward();

    }

    @Override
    public void assignDriver(String name) {
        enemyRobot.reactHuman(name);

    }
}
