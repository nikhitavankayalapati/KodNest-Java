package track.Practice_Sessions.DSE.Assesment4;

import java.util.*;

public class MaxVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        String vowels = "AEIOUaeiou";
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i) + "")) {
                count++;
            }
        }
        int maxCount = count;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k) + "")) {
                count--;
            }
            if (vowels.contains(s.charAt(i) + "")) {
                count++;
            }
            maxCount = Math.max(maxCount, count);

        }
        System.out.println(maxCount);
        sc.close();

    }

}