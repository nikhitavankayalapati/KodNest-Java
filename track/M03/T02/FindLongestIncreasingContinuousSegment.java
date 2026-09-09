package track.M03.T02;


import java.util.Scanner;

public class FindLongestIncreasingContinuousSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int segment = 0, curr = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1])
                curr++;
            else
                curr = 1;
            if (curr > segment)
                segment = curr;
        }
        System.out.println(segment);
        sc.close();
    }
}