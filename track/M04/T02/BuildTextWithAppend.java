package track.M04.T02;

import java.util.Scanner;

public class BuildTextWithAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String courseName = scanner.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append("Learner: ");
        builder.append(learnerName);
        builder.append(" | ");
        builder.append("Course: ");
        builder.append(courseName);

        System.out.println(builder);
    }
}