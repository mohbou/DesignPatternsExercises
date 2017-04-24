package main.bridgepattern.example1;

public class Main {

    public static void main(String[] args) {
        EntertainmentDevice tvdevice = new TVDevice();
        EntertainmentDevice dvdDevice = new DVDDevice();

        RemoteButton remote = new RemoteButton(tvdevice);
        remote.buttonFivePressed();
        remote.buttonSixPressed();

        RemoteButton remote2 = new RemoteButton(dvdDevice);
        remote2.buttonFivePressed();
        remote2.buttonSixPressed();
    }
}
