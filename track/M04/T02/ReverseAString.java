package track.M04.T02;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        System.out.println("Reversed: " + sb.reverse());
        scanner.close();
    }
}