import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void InitializeMap(char[] map) {
        for (int i = 0; i < map.length; i++)
            map[i] = '0';
    }
    
    public static void PrintMap(char[] map, int width) {
        for (int i = 0; i < map.length; i++) {
            System.out.print(map[i] + " ");
            if (i % width == width - 1) System.out.println();
        }
    }

    public static int Move(char[] map, int px, int movement) {
        map[px] = '0';
        px += movement;
        map[px] = '1';
        return px;
    }

    public static void main(String[] args) {
        int pIndex = -1;
        int health = 10;
        char map[];

        Scanner input = new Scanner(System.in);

        // Get map dimensions in range
        int width=-1, height=-1; // Set to -1 to indicate not yet set
        do {
            System.out.print("Enter width: "); width = input.nextInt();
            System.out.print("Enter height: "); height = input.nextInt();
        } while (!(width > 4 && width < 15 &&  height > 4 && height < 15));

        // Have the map dimensions, now initialize and find a random player pos
        map = new char[width*height];
        InitializeMap(map);
        pIndex = (int)(Math.random() * map.length);
        map[pIndex] = '1';


        while (health > 0) {
            boolean inputGood = true;
            do {
                PrintMap(map, width);

                System.out.print("> ");
                String actionString = input.next();
                char action = actionString.charAt(0);


                switch (action) {
                    case 'W':
                    case 'w':
                        pIndex = Move(map, pIndex, -width);
                        break;
                    case 's':
                        pIndex = Move(map, pIndex, width);
                        break;
                    case 'a':
                        pIndex = Move(map, pIndex, -1);
                        break;
                    case 'd':
                        pIndex = Move(map, pIndex, 1);
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
