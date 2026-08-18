package track.M02.T08;

import java.util.Scanner;

public class FindArrayStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mini = arr[0];
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }

            else if (arr[i] < mini) {
                mini = arr[i];
            }
        }

        System.out.println("Minimum: " + mini);
        System.out.println("Maximum: " + maxi);
    }
}
