package main.lambdaPractice;

public class RunnableExample {

    public static void main(String[] args) {

        // classic boilerplate for Interface Runnable

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable!");
            }
        });
        myThread.run();

        // Thread, Runnable using Lambda
        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable!"));
        myLambdaThread.run();
    }
}
