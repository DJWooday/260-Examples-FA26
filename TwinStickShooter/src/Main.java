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
        int pIndex = (int)(Math.random() * map.length);
        Entity player = new Entity(pIndex);
        map[pIndex] = '1';

        Entity[] enemies = new Entity[10];
        for (int i = 0; i < enemies.length; i++)
            enemies[i] = new Entity((int)(Math.random() * map.length));

        while (player.health > 0) {
            boolean inputGood = true;
            do {
                PrintMap(map, width);

                System.out.print("> ");
                String actionString = input.next();
                char action = actionString.charAt(0);



                int p;
                switch (action) {
                    case 'W':
                    case 'w':
                        //pIndex = Move(map, pIndex, -width);
                        map[player.position] = '0';
                        p = player.Move(-width);
                        map[p] = '1';
                        break;
                    case 's':
                        //pIndex = Move(map, pIndex, width);
                        map[player.position] = '0';
                        p = player.Move(width);
                        map[p] = '1';
                        break;
                    case 'a':
                        map[player.position] = '0';
                        p = player.Move(-1);
                        map[p] = '1';
                        break;
                    case 'd':
                        //pIndex = Move(map, pIndex, 1);
                        map[player.position] = '0';
                        p = player.Move(1);
                        map[p] = '1';
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
