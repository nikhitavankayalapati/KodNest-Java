package track.Practice_Sessions.DSE.Assesment_3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), initial = sc.nextInt();
        int[] changes = new int[n];
        for (int i = 0; i < n; i++)
            changes[i] = sc.nextInt();
        System.out.println(highestBalance(initial, changes));
        sc.close();
    }

    public static long highestBalance(int initial, int[] changes) {
        long currentBalance = initial;
        long maxBalance = initial;

        for (int change : changes) {
            currentBalance += change;
            if (currentBalance > maxBalance) {
                maxBalance = currentBalance;
            }
        }

        return maxBalance;
    }
}
