package track.Practice_Sessions.DSE.Assesment_1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int result = countAboveAverage(marks);
        System.out.println("Students above average: " + result);

        sc.close();
    }

    public static int countAboveAverage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        int avg = total / marks.length;
        int count = 0;
        for (int mark : marks) {
            if (mark > avg) {
                count++;
            }
        }
        return count;
    }

}
