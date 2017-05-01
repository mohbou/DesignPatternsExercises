package main.mementopattern.example1;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<Memento> mementos =  new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }
    public void removeMemento(Memento memento) {
        mementos.remove(memento);
    }
    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
