package track.Practice_Sessions;

import java.util.Scanner;

public class dailyattendancetotals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classes = scanner.nextInt();
        int days = scanner.nextInt();

        int[][] attendance = new int[classes][days];

        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < days; i++) {
            int total = 0;
            for (int j = 0; j < classes; j++) {
                total += attendance[j][i];
            }
            System.out.println("Day " + (i + 1) + " total: " + total);
        }
        sc.close();
    }
}