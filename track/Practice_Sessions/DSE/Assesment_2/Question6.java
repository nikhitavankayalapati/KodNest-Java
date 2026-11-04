package track.Practice_Sessions.DSE.Assesment_2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] battery = new int[n];
        for (int i = 0; i < n; i++)
            battery[i] = sc.nextInt();
        int limit = sc.nextInt();
        System.out.println(maxGateDistance(battery, limit));
        sc.close();
    }

    public static int maxGateDistance(int[] battery, int limit) {
        int l = 0;
        int r = battery.length - 1;
        while (l < r) {
            if (battery[l] + battery[r] == limit) {
                return r - l;
            } else if (battery[l] + battery[r] >= limit) {
                r -= 1;
            } else {
                l += 1;
            }
        }
        return -1;
    }
}
