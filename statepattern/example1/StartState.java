package main.statepattern.example1;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("StartState......");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
