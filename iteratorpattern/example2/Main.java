package main.iteratorpattern.example2;

public class Main {

    public static void main(String[] args) {

        The70s songs70s = new The70s();
        The80s songs80s = new The80s();
        The90s songs90s =  new The90s();

        DiscPlayer discPlayer =  new DiscPlayer(songs70s,songs80s,songs90s);
        discPlayer.showTheSongs();

    }
}
