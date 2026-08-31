package track.M03.T01;

import java.util.Scanner;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value < 0)
                negative++;
            else if (value > 0)
                positive++;
            else
                zero++;

        }

        System.out.println(positive + " " + negative + " " + zero);
        sc.close();

    }
}
