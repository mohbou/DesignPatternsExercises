package main.commadPatterns.example1;


public class Main {
    public static void main(String[] args) {

        //stuff in house =  Receiver
        Light bedRoomLight = new Light();//receiver
        AirConditioner airConditioner = new AirConditioner();//receiver

        // on commands - concrete commands
        LightOn turnBedRoomLightOn = new LightOn(bedRoomLight);
        AirConditionerOn turnAirConditionerOn = new AirConditionerOn(airConditioner);

        // off commands - concrete commands
        LightOff turnBedRoomLightOff = new LightOff(bedRoomLight);
        AirConditionerOff turnAirConditionerOff= new AirConditionerOff(airConditioner);

        //Invoker
        RemoteController remote = new RemoteController();
        remote.insertNewOnCommand(turnBedRoomLightOn);
        remote.insertNewOnCommand(turnAirConditionerOn);
        remote.insertNewOffCommand(turnBedRoomLightOff);
        remote.insertNewOffCommand(turnAirConditionerOff);

        remote.pressButtonOn(0);
        remote.pressButtonOn(1);
        remote.pressButtonOff(0);
        remote.pressButtonOff(1);
    }
}
