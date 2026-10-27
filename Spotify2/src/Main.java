public class Main {
    public static void main(String[] args) {
        Artist craneWives = new Artist("Crane Wives");
        Song inTheEnd = new Song("In The End", 4, "Rap Metal");
        Song hereComesTheSun = new Song("Here Comes The Sun", 3, "Pop");
        Song billyJean = new Song("Billie Jean", 5, "Pop");

        craneWives.AddTrack(inTheEnd);
        craneWives.AddTrack(hereComesTheSun);
        craneWives.AddTrack(billyJean);

        System.out.print(craneWives);
    }
}
