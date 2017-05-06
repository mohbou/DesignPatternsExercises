package main.chainofresponsabilitypattern.example1;

public class Main {


    public static void main(String[] args) {
        Numbers numbers = new Numbers(10,5,"liv");
        Chain request1 = new DivNumbers();
        Chain request2 = new AddNumbers();
        Chain request3 = new SubNumbers();
        Chain request4 = new MultNumbers();
        request1.setNextChain(request2);
        request2.setNextChain(request3);
        request3.setNextChain(request4);
        request2.calculate(numbers);

    }
}
