import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char quote = '\'';
        String s = "That\'s a lot of spaghetti";
        System.out.println("Your quote is " + s.length() + " long");

        String name = "Jason";
        char lastLetter = name.charAt(name.length()-1);
        System.out.println(lastLetter);

        System.out.print("Enter a restaurant: ");
        String restaurant = input.nextLine();
        int indexOfSpace = restaurant.indexOf(' ');
        String menuItem = restaurant.substring(0, indexOfSpace);
        System.out.println(restaurant + " serves " + menuItem);
        int a = 6^3;
    }
}
