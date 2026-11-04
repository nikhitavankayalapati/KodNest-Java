package track.Practice_Sessions.DSE.Assesment_1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String original = sc.next();
        String typed = sc.next();

        int result = countMatching(original, typed);
        System.out.println("Matching characters: " + result);

        sc.close();
    }

    public static int countMatching(String original, String typed) {
        int count = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}