public class Main {
    public static void main(String[] args) {
        int counter = 10;
        System.out.println("While:");
        while (counter < 10) {
            System.out.print(counter + " ");
            counter++;
        }

        counter = 10;
        System.out.println("\nDo: ");
        do {
            System.out.print(counter + " ");
            counter++;
        } while(counter < 10);

        System.out.println("\nFor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        i++;
    }
}
