package track.M02.T03;

import java.util.Scanner;

public class InteractiveLearnerProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int problemsSolved = scanner.nextInt();
        double Assessment = scanner.nextDouble();

        System.out.println("Learner: " + name);
        System.out.println("Problems solved: " + problemsSolved);
        System.out.println("Assessment: " + Assessment);

        scanner.close();
    }
}
