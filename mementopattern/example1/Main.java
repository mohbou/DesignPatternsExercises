package main.mementopattern.example1;

// Memento Design Pattern Tutorial


public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.set("State #1");
        originator.set("State #2");
        careTaker.addMemento(originator.storeInMemento());

        originator.set("State #3");
        careTaker.addMemento(originator.storeInMemento());

        originator.set("State #4");
        System.out.println("Current State: " + originator.getArticle());


        System.out.println("First saved State: " + careTaker.getMemento(0).getSavedArticle());
        originator.restoreFromMemento(careTaker.getMemento(1));
        System.out.println("Second saved State: " + originator.getArticle());

    }


}
