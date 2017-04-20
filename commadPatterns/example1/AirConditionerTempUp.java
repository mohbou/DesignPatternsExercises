package main.commadPatterns.example1;
//Concrete class command
public class AirConditionerTempUp implements Command {

    private AirConditioner airConditioner;

    public AirConditionerTempUp(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.increaseTemp();
    }
}
