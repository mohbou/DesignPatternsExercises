package main.bridgepattern.example1;

//abstraction
public class RemoteButton {

    EntertainmentDevice device;

    public RemoteButton(EntertainmentDevice device) {
        this.device = device;
    }

    public void buttonFivePressed() {
        device.buttonFivePressed();
    }
    public void buttonSixPressed() {

        device.buttonSixPressed();
    }
}
