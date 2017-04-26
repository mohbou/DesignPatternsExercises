package main.observerPattern.example1;

import java.util.ArrayList;
import java.util.List;

//observable
public class WeatherStationConcrete implements WeatherStationSubject {

    private List<Observer> observers =  new ArrayList<>();

    private int temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));

    }

    @Override
    public void notifyAllObservers() {

        for(Observer observer:observers)
        {
            observer.update(temperature);
        }

    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }


}
