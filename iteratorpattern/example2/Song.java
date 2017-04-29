package main.iteratorpattern.example2;

public class Song {

    private String songName;
    private int yearReleased;

    public Song(String songName, int yearReleased) {
        this.songName = songName;
        this.yearReleased = yearReleased;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }
}
