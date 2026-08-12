package track.M02.T05;

import java.util.Scanner;

class Printer {
    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);

    }

}

public class CreatedTwoSimpleOverloadedMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer p = new Printer();
        int number = sc.nextInt();
        String word = sc.next();
        p.show(number);
        p.show(word);

        sc.close();
    }

}