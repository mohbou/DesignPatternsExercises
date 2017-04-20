package main.observerPattern;

public interface WeatherStationSubject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();

}
