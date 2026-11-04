package track.Practice_Sessions.DSE.Assesment_2;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] expected = new int[n];
        for (int i = 0; i < n; i++)
            expected[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] scanned = new int[m];
        for (int i = 0; i < m; i++)
            scanned[i] = sc.nextInt();
        System.out.println(missingCount(expected, scanned));
        sc.close();
    }

    public static int missingCount(int[] expected, int[] scanned) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < scanned.length; i++) {
            set.add(scanned[i]);
        }
        int count = 0;
        for (int i = 0; i < expected.length; i++) {
            if (!set.contains(expected[i]))
                count++;
        }
        return count;
    }
}