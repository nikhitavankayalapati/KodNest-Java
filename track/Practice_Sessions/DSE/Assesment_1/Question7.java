package track.Practice_Sessions.DSE.Assesment_1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            visited[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] required = new int[m];

        for (int i = 0; i < m; i++) {
            required[i] = sc.nextInt();
        }

        boolean result = checkRoute(visited, required);

        if (result) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

        sc.close();
    }

    public static boolean checkRoute(int[] visited, int[] required) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < visited.length && j < required.length; i++) {
            if (visited[i] == required[j]) {
                count++;
                j++;
            }
        }
        if (count == required.length) {
            return true;
        }
        return false;
    }
}