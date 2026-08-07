package track.Practice_Sessions;

import java.util.Scanner;

public class GroupingAnd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codingScore = scanner.nextInt();
        int attendance = scanner.nextInt();
        int projects = scanner.nextInt();

        boolean eligible = codingScore >= 60 && attendance >= 75 || projects >= 2;

        System.out.println(eligible ? "Eligible" : "Not Eligible");

        scanner.close();
    }
}