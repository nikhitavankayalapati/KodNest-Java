package track.M02.T04;

import java.util.Scanner;

public class CreateCompareTwoObjects {
    static class Student {
        int id;
        String name;
        int javaScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.javaScore = sc.nextInt();

        Student s2 = new Student();
        s2.id = sc.nextInt();
        s2.name = sc.next();
        s2.javaScore = sc.nextInt();
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);
        if (s1.javaScore > s2.javaScore) {
            System.out.println(s1.name + " has the higher Java score.");
        }

        else if (s1.javaScore < s2.javaScore) {
            System.out.println(s2.name + " has the higher Java score.");
        }

        else {
            System.out.println("Both students have the same Java score.");
        }
        sc.close();
    }
}
