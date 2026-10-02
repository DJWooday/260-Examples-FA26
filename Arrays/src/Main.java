import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStuds = 10; // input.nextInt();
        float[] testScores = new float[numStuds];

        for (int i = 0; i < testScores.length; i++) {
            System.out.print("Test Score: ");
            //testScores[i] = input.nextFloat(); Get with input
            testScores[i] = (float)Math.random() * 100;
            System.out.println(testScores[i]);
        }

        // Shallow copy
        //float[] scoresWithBonus = testScores;
        //scoresWithBonus[0] = 100;

        // Deep copy
        float[] scoresWithBonus = new float[testScores.length];
        for (int i = 0; i < testScores.length; i++)
            scoresWithBonus[i] = testScores[i] + 10;

        float sum = 0;
        for (float score : testScores) {
            sum += score;
        }

        System.out.println("\nAverage: " + (sum / testScores.length));

        System.out.println(testScores);

        Arrays.sort(testScores);
        System.out.println(Arrays.toString(testScores));
    }
}
