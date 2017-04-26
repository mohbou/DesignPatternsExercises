package main.observerPattern.example2;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private long ibmPrice;
    private long aaplPrice;
    private long googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {

        int index = observers.indexOf(observer);
        observers.remove(index);
        System.out.println("Observer "+index+1+" deleted");

    }

    @Override
    public void notifyObserver() {

        for(Observer observer:observers) {
            observer.update(ibmPrice,aaplPrice,googPrice);
        }

    }

    public void setIbmPrice(long ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(long aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(long googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
