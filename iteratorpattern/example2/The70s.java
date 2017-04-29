package main.iteratorpattern.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class The70s implements SongIterator {

    List<Song> bestSongs;

    public The70s() {
        bestSongs =  new ArrayList<>();
        addSong("Imagine", 1971);
        addSong("American Pie", 1971);
        addSong("I Will Survive", 1979);
    }

    public void addSong(String songName, int yearReleased){

        Song songInfo = new Song(songName, yearReleased);

        bestSongs.add(songInfo);

    }

    public List<Song> getBestSongs() {
        return bestSongs;
    }


    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
