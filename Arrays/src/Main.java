import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStuds = input.nextInt();
        float[] testScores = new float[numStuds];

        for (int i = 0; i < testScores.length; i++) {
            System.out.print("Test Score: ");
            testScores[i] = input.nextFloat();
        }

        // Shallow copy
        //float[] scoresWithBonus = testScores;
        //scoresWithBonus[0] = 100;

        // Deep copy
        float[] scoresWithBonus = new float[testScores.length];
        for (int i = 0; i <= testScores.length; i++)
            scoresWithBonus[i] = testScores[i] + 10;

        float sum = 0;
        for (float score : testScores) {
            score += 10;
            sum += score;
        }

        System.out.println("\nAverage: " + (sum / testScores.length));

        System.out.println(testScores);
    }
}
