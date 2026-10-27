public class Track {
    String title;
    int runTime;
    public Track() {
        this("Track X", 0);
    }
    public Track(String t, int r) {
        title = t; runTime = r;
    }

    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        // Todo: check equality
        return false;
    }
}
