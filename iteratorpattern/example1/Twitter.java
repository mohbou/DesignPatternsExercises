package main.iteratorpattern.example1;

public class Twitter {

    private String [] users;
    public Twitter() {
        users = new String[20];
        for (int i = 0; i < 20; i++) {
            users[i] = "John"+i;
        }
    }
}
