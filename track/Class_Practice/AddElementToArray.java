package track.Class_Practice;

import java.util.Scanner;

public class AddElementToArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be added");
        int ele = sc.nextInt();
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        b[n] = ele;
        System.out.println("Updated array: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();

    }
}
