package track.Practice_Sessions.DSE.Assesment_1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int result = longestStreak(word);
        System.out.println("Longest streak: " + result);

        sc.close();
    }

    public static int longestStreak(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }

        int maxStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
            }
        }

        return maxStreak;
    }
}
