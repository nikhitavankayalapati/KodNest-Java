package track.Practice_Sessions;

import java.util.Scanner;

class DeliveryCalculator {
    // One-parameter overload
    int calculateCharge(int distance) {
        return distance * 5;
    }

    // Two-parameter overload
    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}

public class DeliveryChargeOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        DeliveryCalculator dc = new DeliveryCalculator();

        // Call the one-parameter overload
        System.out.println("Standard Charge: " + dc.calculateCharge(distance));

        // Call the two-parameter overload
        System.out.println("Express Charge: " + dc.calculateCharge(distance, expressFee));

        scanner.close();
    }
}