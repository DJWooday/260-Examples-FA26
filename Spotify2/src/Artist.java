public class Artist extends Creator {
    Album[] albums;
    public Artist() {
        super("Unknown Band");
    }
    public Artist(String n) {
        super(n);
    }
    public Artist(String n, Track[] tracks) {
        super(n, tracks);
    }
}
