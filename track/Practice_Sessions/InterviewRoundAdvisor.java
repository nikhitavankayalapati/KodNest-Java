package track.Practice_Sessions;

public class InterviewRoundAdvisor {
    public static void main(String[] args) {

        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;

        System.out.print("Current Round: ");

        switch (roundCode) {
            case 1:
                System.out.println("Aptitude Round");
                break;

            case 2:
                System.out.println("Technical Round");
                break;

            case 3:
                System.out.println("HR Round");
                break;

            case 4:
            case 5:
                System.out.println("Final Review");
                break;

            default:
                System.out.println("Invalid Round");
        }

        String res = attemptsUsed < maxAttempts
                ? "Attempt Available"
                : "Attempt Limit Reached";

        System.out.println("Attempt Status: " + res);
    }
}
