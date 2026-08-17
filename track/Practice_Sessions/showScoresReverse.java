package track.Practice_Sessions;

import java.util.Scanner;

public class showScoresReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] scores = new int[size];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();

        }

        System.out.print("Reverse scores: ");
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }
        sc.close();
    }
}
