package main.commadPatterns.example1;
//Concrete class command
public class AirConditionerTempDown implements Command {

    private AirConditioner airConditioner;

    public AirConditionerTempDown(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.decreaseTemp();

    }
}
