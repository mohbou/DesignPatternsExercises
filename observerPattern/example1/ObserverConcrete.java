package main.observerPattern.example1;

public class ObserverConcrete implements Observer {

    private int temperature;
    private WeatherStationSubject weatherStationSubject;

    public ObserverConcrete(WeatherStationSubject weatherStationSubject) {
        this.weatherStationSubject =weatherStationSubject;
        weatherStationSubject.addObserver(this);
    }

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        System.out.println("temperature updated "+this.getClass().getName()+" "+temperature);

    }
}
