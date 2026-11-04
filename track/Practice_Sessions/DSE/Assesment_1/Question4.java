package track.Practice_Sessions.DSE.Assesment_1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String result = createCode(word);
        System.out.println(result);

        sc.close();
    }

    public static String createCode(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i));
            sb.append(i + 1);
        }
        return sb.toString();
    }
}