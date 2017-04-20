package main.factoryPattern;

public class Main {



    public static void main(String[] args) {
        FactoryPhone factory= new FactoryPhone();
        factory.makePhone("SAMSUNG");
        factory.makePhone("NOKIA");
        factory.makePhone("IPHONE");

    }
}
