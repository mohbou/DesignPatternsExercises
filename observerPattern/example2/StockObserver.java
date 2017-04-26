package main.observerPattern.example2;

public class StockObserver implements Observer {

    private long ibmPrice;
    private long aaplPrice;
    private long googPrice;

    private int observerId;
    private static int observerTrackerId =0;

    public Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerTrackerId;
        System.out.println("New Observer "+this.observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(long ibmPrice, long aaplPrice, long googPrice) {
        this.ibmPrice=ibmPrice;
        this.aaplPrice=aaplPrice;
        this.googPrice=googPrice;
        printPrices();

    }

    public void printPrices() {
        System.out.println(observerId+ " \nIBM "+ibmPrice+" \naapl "+aaplPrice+" \nGoogPrice "+googPrice+"\n");
    }
}
