package main.commadPatterns.example1;
//Concrete class command
public class AirConditionerOn implements Command {

    private AirConditioner airConditioner;

    public AirConditionerOn(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
