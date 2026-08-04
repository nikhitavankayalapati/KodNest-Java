package track.Practice_Sessions;

public class PlacementReadiness {
    public static void main(String[] args) {

        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;

        boolean academicEligible = marks >= 60 && attendance >= 75 && !activeBacklog;

        if (!academicEligible) {
            System.out.println("Improve Academic Eligibility");
        } else if (academicEligible && !projectCompleted) {
            System.out.println("Complete Project");
        } else if (projectCompleted && mockInterviewScore < 70) {
            System.out.println("Improve Interview Skills");
        } else {
            System.out.println("Placement Ready");
        }
    }
}
