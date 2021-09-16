package oop;

public class SongPlayer {
    public static void main(String[] args) {
        Song song1 = new Song("time flies", "drake");
        Song song2 = new Song("Love all", "drake");

        song1.setTitle("pony"); //updates the title
        song1.setArtist("Ginuwine"); //updates the artist

        System.out.println(song1);
        System.out.println(song2);

        song1.play();
    }
}

