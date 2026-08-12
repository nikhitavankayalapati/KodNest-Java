package track.Practice_Sessions;

import java.util.Scanner;

class StudentProgress {
    String name;
    int completedLessons;
    int totalLessons;
    int percentage;
}

public class LearningProgressCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentProgress s = new StudentProgress();

        s.name = sc.next();
        s.completedLessons = sc.nextInt();
        s.totalLessons = sc.nextInt();

        s.percentage = s.completedLessons * 100 / s.totalLessons;

        System.out.println("Student: " + s.name);
        System.out.println("Progress: " + s.completedLessons + "/" + s.totalLessons);
        System.out.println("Completion: " + s.percentage + "%");
    }
}