package track.Class_Practice;

import java.util.Scanner;

public class ScannerReadLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("Age is" + age);
        System.out.println("enter height");
        double height = sc.nextDouble();
        System.out.println("Height" + height);
        sc.nextLine();
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("Name :" + name);
    }
}
