import java.util.Arrays;

public class Creator {
    String name;
    Track[] tracks;
    public Creator() {
        this("Name");
    }
    public Creator(String n) {
        this(n, new Track[0]);
    }
    public Creator(String n, Track[] t) {
        name = n;
        tracks = new Track[t.length];
        for (int i = 0; i < t.length; i++)
            tracks[i] = new Track(t[i].title, t[i].runTime);
    }

    public void AddTrack(Track t) {
        Track[] temp = new Track[tracks.length + 1];
        for (int i = 0; i < tracks.length; i++)
            temp[i] = tracks[i];
        temp[temp.length-1] = t;
        tracks = temp;
    }

    public String toString() {
        return name + Arrays.toString(tracks);
    }
}
