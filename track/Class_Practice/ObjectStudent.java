package track.Class_Practice;

import java.util.*;

public class ObjectStudent {
    int rollno;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

class ObjectStudentApplication {
    public static void main(String[] args) {
        ObjectStudent s1 = new ObjectStudent();
        s1.rollno = 1;
        s1.name = "Nikhita";
        s1.height = 5.5;
        System.out.println("Roll no:" + s1.rollno);
        System.out.println("Name:" + s1.name);
        System.out.println("Height:" + s1.height);
        s1.run();
        s1.sleep();

        Scanner sc = new Scanner(System.in);
        ObjectStudent s2 = new ObjectStudent();
        System.out.print("enter roll number: ");
        s2.rollno = sc.nextInt();
        System.out.print("eneter Name: ");
        s2.name = sc.next();
        System.out.print("enetr height: ");
        s2.height = sc.nextDouble();
        System.out.println("roll no" + s2.rollno);
        System.out.println("name" + s2.name);
        System.out.println("height" + s2.height);
        s2.run();
        s2.sleep();

        sc.close();
    }
}
