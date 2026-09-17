import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int playerX, playerY;
        int health = 10;
        boolean alive;

        Scanner input = new Scanner(System.in);
        System.out.print("> ");
        String actionString = input.next();
        char action = actionString.charAt(0);

        System.out.println(action);

        int minPos = 3;
        int maxPos = 10;
        playerX = (int)(Math.random() * (maxPos - minPos + 1) + minPos);
        playerY = (int)(Math.random() * (maxPos - minPos + 1) + minPos);

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
        }
        System.out.println("Position " + playerX + ", " + playerY);

        System.out.print("Enter damage: ");
        int damage = input.nextInt();
        health -= damage;
        //alive = (health < 0) ? false : true;
        alive = health > 0;
        if (!alive) System.out.println("Dead lul");

        int min = (playerX < playerY) ? playerX : playerY;
        System.out.println("Min: " + min);
    }
}
