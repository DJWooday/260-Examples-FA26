import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numMilk = 5, numTP = 1, numSC = 12;
        System.out.println("Budget:");
        System.out.printf("%20s %8d %8.2f\n", "Milk", numMilk, 3.99);
        System.out.printf("%20s %8d %8.2f\n", "Toilet Paper", numTP, 20.0);
        System.out.println("Scented Candles, 120, 12");

        int rows = 3, cols = 4;
        int temp = rows;
        rows = cols;
        cols = temp;
        System.out.println("Rows: " + rows + ", Cols: " + cols);

        char grade = 'A';
        //System.out.println("Grade after cheating: " + ++grade);
        String output = "Grade after cheating bad: " + (char)(grade + 4);
        System.out.println(output);
        if (grade > 'A') {
            System.out.println("You'll do better next time, champ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Gimme number: ");
        char i = input.next().charAt(0);
        input.nextLine();

        if (Character.isDigit(i)) {
            System.out.println("Good");
            Integer.parseInt(i + "");
        }
        else if (Character.isLetter(i)) System.out.println("Bad");
        else System.out.println("Wut");

        String course = "CMPS 260";
        System.out.print("What class you takin? ");
        String myCourse = input.nextLine();

        String otherCourse = "CMPS 260";

        if (course == otherCourse) {
            System.out.println("Courses match");
        }
        if (course.equals(myCourse))
            System.out.println("Courses actually match");



    }
}
