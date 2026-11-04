package track.Practice_Sessions.DSE.Assesment_2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(codesMatch(first, second) ? "MATCH" : "MISMATCH");
        sc.close();
    }

    public static boolean codesMatch(String first, String second) {
        first.toLowerCase();
        second.toLowerCase();
        int f = 0, s = 0;
        while (f < first.length() && s < second.length()) {
            if (!Character.isLetterOrDigit(first.charAt(f))) {
                f += 1;
            } else {
                if (!Character.isLetterOrDigit(second.charAt(s)) || (first.charAt(f) != second.charAt(s))) {
                    return false;
                } else {
                    f++;
                    s++;
                }
            }
        }
        return true;
    }
}