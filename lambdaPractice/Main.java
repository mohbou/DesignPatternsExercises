package main.lambdaPractice;

public class Main {


    public void greeter(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        HelloWorldGreeting greeting = new HelloWorldGreeting();
        Main main = new Main();
        main.greeter(greeting);

        //first example
        Mylambda myLamdbaFuntion = () -> System.out.println("Hello world");

        //second example
        Myadd addFunction = (a,b) -> a+b;
    }
}
