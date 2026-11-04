package track.Class_Practice.ExceptionHandling;

import java.util.*;

public class Division {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Connection started");
            System.out.print("Enter A: ");
            int a = sc.nextInt();
            System.out.print("Enetr B: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Exception handled");
            System.out.println(e.getMessage());
        }
        System.out.println("connection terminted ");

    }

}
