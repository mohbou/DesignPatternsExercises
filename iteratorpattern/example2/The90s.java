package main.iteratorpattern.example2;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;

public class The90s implements SongIterator {

    Hashtable<Integer,Song> bestSongs =  new Hashtable<>();
    int hashKey = 0;

    public The90s() {
        addSong("Losing My Religion", 1991);
        addSong("Creep",  1993);
        addSong("Walk on the Ocean", 1991);

    }

    // Add a new SongInfo Object to the Hashtable and then increment
    // the Hashtable key

    public void addSong(String songName, int yearReleased){

        Song songInfo = new Song(songName, yearReleased);

        bestSongs.put(hashKey, songInfo);

        hashKey++;

    }

    public Hashtable<Integer, Song> getBestSongs() {
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
