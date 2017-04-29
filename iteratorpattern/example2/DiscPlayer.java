package main.iteratorpattern.example2;

import java.util.Iterator;

public class DiscPlayer {



    SongIterator iterSongs70;
    SongIterator iterSongs80;
    SongIterator iterSongs90;

    public DiscPlayer(SongIterator iterSongs70, SongIterator iterSongs80, SongIterator iterSongs90) {
        this.iterSongs70 = iterSongs70;
        this.iterSongs80 = iterSongs80;
        this.iterSongs90 = iterSongs90;
    }

    public void showTheSongs(){

        System.out.println("NEW WAY WITH ITERATOR\n");

        Iterator Songs70s = iterSongs70.createIterator();
        Iterator Songs80s = iterSongs80.createIterator();
        Iterator Songs90s = iterSongs90.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(Songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(Songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(Songs90s);

    }

    public void printTheSongs(Iterator iterator){

        while(iterator.hasNext()){

            Song songInfo = (Song) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getYearReleased() + "\n");

        }

    }
}
