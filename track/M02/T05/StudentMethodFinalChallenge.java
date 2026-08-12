package track.M02.T05;

import java.util.Scanner;

class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + this.name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class StudentMethodFinalChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        s1.name = sc.nextLine();

        int first = sc.nextInt();
        int second = sc.nextInt();
        s1.setName(s1.name);
        s1.showName();
        s1.showScore(first);
        s1.showScore(first, second);

        sc.close();
    }
}