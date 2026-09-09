package track.M04.T01;

import java.util.Scanner;

public class TraceStringChanges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        // Call toUpperCase() without storing the result.
        // Create and display an uppercase copy.
        System.out.println("Original: " + original);
        String res = original.toUpperCase();
        System.out.println("After ignored call: " + original);
        System.out.println("Uppercase copy: " + res);

        scanner.close();
    }
}