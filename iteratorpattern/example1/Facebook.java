package main.iteratorpattern.example1;

import java.util.ArrayList;
import java.util.List;

//aggregate
public class Facebook implements SocialNetworking {

    private List<String> users;



    public Facebook() {
        users = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            users.add("Mike"+i);
        }



    }

    @Override
    public Iterator createIterator() {
        return null;
    }
}
