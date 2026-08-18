package track.M02.T07;

import java.util.*;

public class AnalyzeRunTimeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int marks[] = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        System.out.println("Total: " + total);
    }
}