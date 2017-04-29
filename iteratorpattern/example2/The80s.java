package main.iteratorpattern.example2;

import java.util.Arrays;
import java.util.Iterator;

public class The80s implements SongIterator {

    Song [] bestSongs;
    int arrayValue = 0;

    public The80s() {
        bestSongs =  new Song[3];
        addSong("Roam",  1989);
        addSong("Cruel Summer", 1984);
        addSong("Head Over Heels", 1985);

    }
    public void addSong(String songName,  int yearReleased){

        Song song = new Song(songName, yearReleased);

        bestSongs[arrayValue] = song;

        arrayValue++;

    }


    public Song[] getBestSongs() {
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
