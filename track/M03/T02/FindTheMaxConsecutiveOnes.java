
package track.M03.T02;

import java.util.Scanner;

public class FindTheMaxConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int maxCount = 0, currCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                currCount++;
            } else {
                currCount = 0;
            }
            if (maxCount < currCount)
                maxCount = currCount;
        }
        System.out.println(maxCount);
        sc.close();
    }
}
