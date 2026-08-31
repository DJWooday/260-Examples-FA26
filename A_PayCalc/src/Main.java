public class Main {
    public static void main(String[] args) {
        final float HOURLY_RATE = 10.5f;
        byte numberHours = 25;
        float taxRate = .18f;

        float pay = HOURLY_RATE * numberHours * (1-taxRate);
        System.out.println("You made: " + pay);
    }
}
