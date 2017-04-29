package main.iteratorpattern.example1;

public class TwitterIterator implements Iterator {

    private String [] users;
    private int position;

    public TwitterIterator(String[] users) {
        this.users = users;
        position = 0;
    }

    @Override
    public void first() {
        position=0;

    }

    @Override
    public String next() {
        return users[position++];
    }

    @Override
    public String currentItem() {
        return users[position];
    }

    @Override
    public boolean isDone() {
        return position>=users.length;
    }
}
