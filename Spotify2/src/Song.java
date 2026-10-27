public class Song extends Track {
    String genre;
    public Song() {

    }
    public Song(String n, int r, String g) {
        super(n, r);
        genre = g;
    }
}
