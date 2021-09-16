package oop;

public class Song {

    //instance variables
    String title;
    String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void play(){
        System.out.println("playing: " + this.title + " by " + this.artist);
    }


}
