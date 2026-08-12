package track.M02.T05;

import java.util.Scanner;

public class StoreANameUsingThis {
    static class Student {
        String name;

        void setName(String name) {
            this.name = name;
        }

        void displayName() {
            System.out.print("Student Name: " + name);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Student s1 = new Student();

        s1.setName(name);
        s1.displayName();

        sc.close();
    }
}