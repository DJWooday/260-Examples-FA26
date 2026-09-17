import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        int hoursWorked = input.nextInt();

        float payRate = 10.5f;
        float taxRate = .18f;
        float pay = hoursWorked * payRate * (1-taxRate);

        float auraThreshold = 60;
        System.out.print("Enter aura: ");
        float myAura = input.nextFloat();

        int numExceptions = 2;

        if (pay >= 400 || myAura >= auraThreshold)
            System.out.println("You can stay... for now");
        if (pay >= 200) {
            if (numExceptions > 0) {
                System.out.println("Get outta here ya lil scamp");
            } else
                System.out.println("You're on thin ice, bub");
        }
        else
            System.out.println("Broke bitch, get off my lawn, I never loved you, no one ver liked you, fuck you, and you're adopted.");

    }
}
