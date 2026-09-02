import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final float HOURLY_RATE = 10.5f;
        System.out.print("Enter num hours: ");
        byte numberHours = input.nextByte();
        System.out.print("Enter tax rate: ");
        float taxRate = input.nextFloat();
        input.nextLine();

        System.out.print("Enter name: ");
        String name = input.nextLine();

        float pay = HOURLY_RATE * numberHours * (1-taxRate);
        System.out.println("Hi " + name + ", you made: " + pay);

        System.out.println("Enter word number word");
        input.next();
        int num = input.nextInt();
        input.next();
        System.out.print(num);
    }
}
