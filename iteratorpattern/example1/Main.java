package main.iteratorpattern.example1;

public class Main {

    public static void main(String[] args) {
        Facebook fb = new Facebook();
        Twitter twitter = new Twitter();

        Iterator fbIterator = fb.createIterator();
        Iterator twitterIterator = twitter.createIterator();

        while(!fbIterator.isDone()) {
            System.out.println(fbIterator.next());
        }

        while(!twitterIterator.isDone()) {
            System.out.println(twitterIterator.next());
        }


    }
}
