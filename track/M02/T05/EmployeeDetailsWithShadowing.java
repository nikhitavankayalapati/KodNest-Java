package track.M02.T05;

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetailsWithShadowing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();

        Employee e1 = new Employee();

        e1.setDetails(name, salary);
        e1.displayDetails();

        sc.close();
    }
}