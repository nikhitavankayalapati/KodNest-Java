package track.M02.T04;

import java.util.Scanner;

public class StudentRegistrationObjectSystem {
    static class Student {
        int registrationId;
        String name;
        double attendancePercentage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.registrationId = sc.nextInt();
        s1.name = sc.next();
        s1.attendancePercentage = sc.nextDouble();

        // Create and populate secondStudent
        Student s2 = new Student();
        s2.registrationId = sc.nextInt();
        s2.name = sc.next();
        s2.attendancePercentage = sc.nextDouble();

        int registrationid = sc.nextInt();
        double newPercentage = sc.nextDouble();

        Student selectedStudent = null;

        if (registrationid == s1.registrationId) {
            selectedStudent = s1;
            s1.attendancePercentage = newPercentage;
            System.out.println("Selected Student: " + s1.name);
        } else if (registrationid == s2.registrationId) {
            selectedStudent = s2;
            s2.attendancePercentage = newPercentage;
            System.out.println("Selected Student: " + s2.name);
        } else {
            System.out.println("Student not found.");
        }
        sc.close();
        System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
        System.out.println(s2.registrationId + " - " + s2.name + " - " + s2.attendancePercentage + "%");
    }
}