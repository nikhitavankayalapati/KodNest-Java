package track.M04.T01;

import java.util.Scanner;

public class CountVowelInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int vowelcount = 0;
        text = text.toLowerCase();
        // Traverse the text and update vowelcount.
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;
            }
        }
        System.out.println("Vowels: " + vowelcount);
        scanner.close();
    }
}
