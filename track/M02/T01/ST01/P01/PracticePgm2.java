package track.M02.T01.ST01.P01;

public class PracticePgm2 {
    public static void main(String[] args) {
        int completedProblems = 27;
        double reportValue = completedProblems;

        double exactPercentage = 86.75;
        int wholePercentage = (int) exactPercentage;

        int solvedProblems = 47;
        int practiceDays = 5;
        double average = (double) solvedProblems / practiceDays;

        System.out.println("Report value: " + reportValue);
        System.out.println("Whole percentage: " + wholePercentage);
        System.out.println("Average: " + average);
    }
}
