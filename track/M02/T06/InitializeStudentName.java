package track.M02.T06;

import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class InitializeStudentName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Student s = new Student(name);

        s.display();

        sc.close();
    }
}