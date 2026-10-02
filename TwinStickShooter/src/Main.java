import java.util.Scanner;
public class Main {
    public static void InitializeMap(char[] map) {
        for (int i = 0; i < map.length; i++)
            map[i] = '0';
    }
    public static void PrintMap(char[] map) {
        for (char c : map)
            System.out.print(c + " ");
    }

    public static int Move(char[] map, int px, int movement) {
        map[px] = '0';
        px += movement;
        map[px] = '1';
        return px;
    }

    public static void main(String[] args) {
        int playerX = 3, playerY = 1;
        int health = 10;
        char map[] = new char[10];
        InitializeMap(map);
        map[playerX] = '1';

        Scanner input = new Scanner(System.in);

        while (health > 0) {
            boolean inputGood = true;
            do {
                PrintMap(map);

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
                        playerX = Move(map, playerX, -1);
                        break;
                    case 'd':
                        playerX = Move(map, playerX, 1);
                        break;
                    default:
                        System.out.println("Bad Input");
                        inputGood = false;
                }
            } while (!inputGood);
            // Enemy stuff happens
            //System.out.println("Position " + playerX + ", " + playerY);
        }
    }
}
