package track.M02.T05;

import java.util.Scanner;

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        double average = (javaScore + sqlScore) / 2.0;
        return average;
    }
}

public class StudentUtilityUsingMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentUtility utility = new StudentUtility();

        int id = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        int javaScore = sc.nextInt();
        int sqlScore = sc.nextInt();

        utility.showReportTitle();
        utility.displayStudent(id, name);

        double percentage = utility.calculatePercentage(javaScore, sqlScore);

        System.out.println("Percentage: " + percentage);

        if (percentage >= utility.getPassingPercentage()) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        sc.close();
    }
}