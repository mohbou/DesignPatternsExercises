package main.observerPattern.example1;

//observable
public interface WeatherStationSubject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();

}
