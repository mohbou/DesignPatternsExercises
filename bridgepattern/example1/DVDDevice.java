package main.bridgepattern.example1;

//concrete implementor

public class DVDDevice implements EntertainmentDevice {
    @Override
    public void buttonFivePressed() {
        System.out.println("DVD Device Next Chapter");
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("DVD Device previous Chapter");
    }
}
