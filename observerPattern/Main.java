package main.observerPattern;

public class Main {

    public static void main(String[] args) {
        WeatherStationConcrete weatherStationSubject =  new WeatherStationConcrete();
        Observer observer1 =  new ObserverConcrete(weatherStationSubject);
        Observer observer2 =  new ObserverConcrete(weatherStationSubject);
        Observer observer3 =  new ObserverConcrete(weatherStationSubject);
        Observer observer4 =  new ObserverConcrete(weatherStationSubject);
        weatherStationSubject.setTemperature(30);
        weatherStationSubject.setTemperature(50);
        weatherStationSubject.setTemperature(60);
        weatherStationSubject.setTemperature(10);

    }
}
