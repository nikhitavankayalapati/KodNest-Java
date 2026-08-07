package track.M02.T03;

import java.util.Scanner;

public class PersonalExpenseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double monthlyincome = sc.nextDouble();
        double rentexpenses = sc.nextDouble();
        double foodexpenses = sc.nextDouble();
        double travelexpenses = sc.nextDouble();

        double totalexpenses = rentexpenses + foodexpenses + travelexpenses;
        double remainingamount = monthlyincome - totalexpenses;

        System.out.println("Total expense: " + totalexpenses);
        System.out.println("Remaining: " + remainingamount);

        if (remainingamount >= 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }

        sc.close();
    }
}