package track.M03.T02;

import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int fi = -1, li = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {

                if (fi == -1) {
                    fi = i;
                }

                li = i;
            }
        }

        System.out.println(fi + " " + li);
        sc.close();
    }
}