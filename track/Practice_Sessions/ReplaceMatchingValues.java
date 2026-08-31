package track.Practice_Sessions;

import java.util.Scanner;

public class ReplaceMatchingValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int replacement = sc.nextInt();
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                count++;
                numbers[i] = replacement;
            }
        }

        System.out.println("Changes: " + count);
        System.out.print("Updated array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
