package track.Class_Practice.ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException() {
        System.out.println("You are too young... still have a time");
    }
}

class OverAgeException extends Exception {
    OverAgeException() {
        System.out.println("You are too old... take rest");
    }
}

class DrivingLicence {
    int age;

    void takeUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your AGE: ");
        age = scan.nextInt();
        scan.close();
    }

    void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        } else if (age > 65) {
            throw new OverAgeException();
        } else {
            System.out.println("DrivingLicence will be issued");
        }
    }
}

public class DLApplication {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserInput();
        try {
            dl.verify();
        } catch (UnderAgeException | OverAgeException e) {
            e.printStackTrace();
        }
        System.out.println("teminated");

    }
}
