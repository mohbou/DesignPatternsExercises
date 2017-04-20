package main.commadPatterns.example1;
//Concrete class command
public class AirConditionerOff implements Command {

    private AirConditioner airConditioner;

    public AirConditionerOff(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();

    }
}
