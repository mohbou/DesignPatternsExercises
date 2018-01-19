package main.lambdaPractice;

public class Main {


    public void greeter(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Main main = new Main();


        //classic way in Java 7
        Greeting greeting = new HelloWorldGreeting();
        main.greeter(greeting);

        //other way in Java7
        Greeting greeting1 =  new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner class way of Hello world");
            }
        };
       main.greeter(greeting1);


        //first lambda example
        Greeting myLamdbaFuntion = () -> System.out.println("Hello world Lambda Called through the perform method");
        main.greeter(myLamdbaFuntion);

        myLamdbaFuntion.perform();
        //second example
        Myadd addFunction = (a,b) -> a+b;
    }
}
