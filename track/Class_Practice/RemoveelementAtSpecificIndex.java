package track.Class_Practice;

import java.util.Scanner;

public class RemoveelementAtSpecificIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index to be removed");
        int index = sc.nextInt();
        int b[] = new int[n - 1];
        for (int i = 0; i <= b.length; i++) {
            if (i == index) {
                continue;
            } else if (i > index) {
                b[i - 1] = a[i];
            } else {
                b[i] = a[i];
            }
        }
        System.out.println("Updated array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();

    }

}
