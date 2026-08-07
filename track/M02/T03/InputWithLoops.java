package track.M02.T03;

import java.util.Scanner;

public class InputWithLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputDays = scanner.nextInt();
        int total = 0;

        for (int i = 1; i <= inputDays; i++) {
            int problemsSolved = scanner.nextInt();
            total += problemsSolved;
        }

        System.out.println("Total solved: " + total);

        if (total >= 20) {
            System.out.println("Status: Strong progress");
        } else if (total < 20 && total >= 10) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }

        scanner.close();
    }
}