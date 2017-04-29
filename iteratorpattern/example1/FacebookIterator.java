package main.iteratorpattern.example1;

import java.util.List;

public class FacebookIterator implements Iterator {
    private List<String> users;
    private int position;

    public FacebookIterator(List<String> users) {
        this.users = users;
    }

    @Override
    public void first() {
        position=0;
    }

    @Override
    public String next() {
        return users.get(position++);
    }

    @Override
    public String currentItem() {
        return users.get(position);
    }

    @Override
    public boolean isDone() {
        return position >=users.size();
    }
}
