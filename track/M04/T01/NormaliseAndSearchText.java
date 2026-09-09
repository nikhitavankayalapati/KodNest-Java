package track.M04.T01;

import java.util.Scanner;

public class NormaliseAndSearchText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        // Normalize both values and search for the keyword.
        sentence = sentence.toLowerCase();
        System.out.println("Normalized text: " + sentence.trim());
        System.out.println("Contains keyword: " + sentence.contains(keyword.toLowerCase()));

        scanner.close();
    }
}