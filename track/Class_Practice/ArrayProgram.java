package track.Class_Practice;

import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the values : ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The values are : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }

}