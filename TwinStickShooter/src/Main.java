import java.util.Scanner;
public class Main {
    int playerX, playerY;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("> ");
        String actionString = input.next();
        char action = actionString.toLowerCase().charAt(0);

        System.out.print(action);
    }
}
