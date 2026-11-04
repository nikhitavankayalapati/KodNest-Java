package track.Practice_Sessions.DSE.Assesment_1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yesterday = sc.nextInt();
        int today = sc.nextInt();
        int difference = today - yesterday;
        System.out.println("Difference: " + Math.abs(difference));
        if (difference > 0) {
            System.out.println("Status: Increased");
        } else {
            System.out.println("Status: Decreased");
        }

        sc.close();
    }

}
