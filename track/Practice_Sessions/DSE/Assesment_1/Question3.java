package track.Practice_Sessions.DSE.Assesment_1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] seats = new int[n];

        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        arrangeSeats(seats);

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(seats[i]);
        }
        System.out.println();

        sc.close();
    }

    public static void arrangeSeats(int[] seats) {
        int l = seats.length - 1;
        for (int r = seats.length - 1; r >= 0; r--) {
            if (seats[r] != 0) {
                int temp = seats[r];
                seats[r] = seats[l];
                seats[l] = temp;
                l -= 1;
            }
        }
    }
}
