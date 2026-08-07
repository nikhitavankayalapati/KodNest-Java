package track.Class_Practice;

import java.util.Scanner;

public class ScannerMethodsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Byte
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();
        System.out.println("Byte value = " + b);

        // Short
        System.out.print("Enter a short value: ");
        short s = sc.nextShort();
        System.out.println("Short value = " + s);

        // Int
        System.out.print("Enter an int value: ");
        int i = sc.nextInt();
        System.out.println("Int value = " + i);

        // Long
        System.out.print("Enter a long value: ");
        long l = sc.nextLong();
        System.out.println("Long value = " + l);

        // Float
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.println("Float value = " + f);

        // Double
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.println("Double value = " + d);

        // Boolean
        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean value = " + bool);

        sc.close();
    }
}