package track.M04.T01;

import java.util.Scanner;

public class NormalizeALearnerName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Normalize and display the name.
        System.out.println("Normalized name: " + learnerName.trim().toUpperCase());
        scanner.close();
    }
}