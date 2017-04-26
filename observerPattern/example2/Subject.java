package main.observerPattern.example2;

public interface Subject {

    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObserver();
}
