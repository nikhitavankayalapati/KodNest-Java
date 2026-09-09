package track.M03.T04;

import java.util.*;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int ele = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (!(set.contains(arr[i]))) {
                set.add(arr[i]);
            } else {
                ele = arr[i];
            }
        }
        int total = 0;
        for (int num : set) {
            total += num;
        }
        int totalsum = (n * (n + 1)) / 2;
        System.out.println(ele + " " + (totalsum - total));
        sc.close();
    }
}