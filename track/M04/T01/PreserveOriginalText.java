package track.M04.T01;

import java.util.Scanner;

public class PreserveOriginalText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        // Create a lowercase copy and display both values.
        String res = original.toLowerCase();
        System.out.println("Original: " + original);
        System.out.println("Lowercase copy: " + res);
        scanner.close();
    }
}
