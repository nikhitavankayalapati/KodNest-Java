package track.M04.T01;

import java.util.Scanner;

public class FindAWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String word = scanner.nextLine();

        // Search and display the result.
        System.out.println("Found: " + sentence.contains(word));

        scanner.close();
    }
}
