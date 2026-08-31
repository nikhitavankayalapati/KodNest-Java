package track.Practice_Sessions;

import java.util.Scanner;

public class findfirstmatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int firstIndex = -1;

        for (int i = 0; i < size; i++) {
            if (target == numbers[i]) {
                firstIndex = i;
                break;
            }
        }

        System.out.println("First index: " + firstIndex);
        sc.close();
    }
}