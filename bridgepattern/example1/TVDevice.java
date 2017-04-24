package main.bridgepattern.example1;

//concrete implementor
public class TVDevice implements EntertainmentDevice {
    @Override
    public void buttonFivePressed() {
        System.out.println("TV Device Volume increased");
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("TV Device Volume decreased");

    }
}
