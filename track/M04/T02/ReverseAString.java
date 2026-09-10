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

/*
 * import java.util.Scanner;
 * 
 * public class RevString {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * System.out.print("Enter the String: ");
 * String str = scan.next();
 * 
 * char arr[] = str.toCharArray();
 * char newArr[] = new char[arr.length];
 * 
 * // Start 'j' at the last valid index of the new array
 * int j = newArr.length - 1;
 * 
 * // Fix the loop condition to stop before 'arr.length'
 * for (int i = 0; i < arr.length; i++) {
 * newArr[j] = arr[i];
 * j--;
 * }
 * 
 * String revStr = new String(newArr);
 * System.out.println("Original String: " + str);
 * System.out.println("Reversed String: " + revStr);
 * 
 * scan.close();
 * }
 * }
 */