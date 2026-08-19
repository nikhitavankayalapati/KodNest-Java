package track.Practice_Sessions;

import java.util.Scanner;

public class ComparePracticePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int[] planned = new int[days];
        int[] completed = new int[days];

        for (int i = 0; i < days; i++) {
            planned[i] = sc.nextInt();
        }

        for (int i = 0; i < days; i++) {
            completed[i] = sc.nextInt();
        }

        int completedDays = 0;
        for (int i = 0; i < days; i++) {
            if (planned[i] == completed[i]) {
                completedDays += 1;
                System.out.println("Day " + (i + 1) + ": Completed");
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");
            }
        }

        System.out.println("Completed days: " + completedDays);
        sc.close();
    }
}
