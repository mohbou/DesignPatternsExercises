package main.adapterpattern.example1;

public class EnemyRobot {


    public void smashWithHands() {
        System.out.println("smash with Hands");
    }
    public void walkForward() {
        System.out.println(" enemy robot walks forward");
    }

    public void reactHuman(String name) {
        System.out.println(" Robot tramps on "+name);
    }
}
