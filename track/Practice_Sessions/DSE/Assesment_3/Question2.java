package track.Practice_Sessions.DSE.Assesment_3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long milestone = sc.nextLong();
        int[] visits = new int[n];
        for (int i = 0; i < n; i++)
            visits[i] = sc.nextInt();
        System.out.println(countMilestones(visits, milestone));
        sc.close();
    }

    public static int countMilestones(int[] visits, long milestone) {
        int n = visits.length;
        int cumulative = 0;
        for (int i = 0; i < n; i++) {
            cumulative += visits[i];
            if (cumulative >= milestone) {
                return n - i;
            }
        }

        return 0;
    }
}