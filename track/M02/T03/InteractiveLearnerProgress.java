package track.M02.T03;

import java.util.Scanner;

public class InteractiveLearnerProgress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        int Days = sc.nextInt();
        int totalSolved = 0;
        for (int i = 1; i <= Days; i++) {
            int solvedProblems = sc.nextInt();
            totalSolved += solvedProblems;
        }
        double average = (double) totalSolved / Days;
        System.out.println("Learner: " + Name);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + average);
        if (average >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }
        sc.close();
    }
}
