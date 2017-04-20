package main.commadPatterns.example1;
//Receiver
public class AirConditioner {

    public static int temperature =0;

    public void turnOn() {
        System.out.println("Turn the Air conditioner On");
    }
    public void turnOff() {
        System.out.println("Turn the Air conditioner Off");

    }

    public void increaseTemp(){
        temperature++;
        System.out.println("Temperature increased "+temperature);


    }
    public void decreaseTemp(){
        temperature--;
        System.out.println("Temperature decreased "+temperature);


    }

}
