import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int playerX = 1, playerY = 1;
        int health = 10;

        Scanner input = new Scanner(System.in);

        while (health > 0) {
            boolean inputGood = true;
            do {
                System.out.print("> ");
                String actionString = input.next();
                char action = actionString.charAt(0);


                switch (action) {
                    case 'W':
                    case 'w':
                        playerY++;
                        break;
                    case 's':
                        playerY--;
                        break;
                    case 'a':
                        playerX--;
                        break;
                    case 'd':
                        playerX++;
                        break;
                    default:
                        System.out.println("Bad Input");
                        inputGood = false;
                }
            } while (!inputGood);
            // Enemy stuff happens
            System.out.println("Position " + playerX + ", " + playerY);
        }
    }
}
