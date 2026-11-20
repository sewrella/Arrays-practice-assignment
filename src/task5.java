import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] scores = new int[5];

        int passed = 0;
        int failed = 0;
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            System.out.print("Enter score " + (i + 1) + ": ");
            int score = input.nextInt();

            while (score < 0 || score > 100) {
                System.out.println("Invalid score! Enter a value from 0 to 100.");
                System.out.print("Enter score again: ");
                score = input.nextInt();
            }

            scores[i] = score;
            sum += scores[i];

            if (scores[i] >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.print("\nScores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println("\nPassed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);

        input.close();
    }
}

