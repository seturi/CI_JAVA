import java.util.ArrayList;

public class Album {
    public final String title;
    public final int year;
    public final Artist artist;
    private final ArrayList<Song> track = new ArrayList<>();

    public Album(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist= artist;
    }

    public void addTrack(Song song) {
        track.add(song);
    }


    public Song getTrack(int number) {
        return track.get(number-1);
    }

}