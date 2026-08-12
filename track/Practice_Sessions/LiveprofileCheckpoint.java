package track.Practice_Sessions;

import java.util.Scanner;

class PracticeProfile {
    String name;
    int points;
}

public class LiveprofileCheckpoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PracticeProfile live = new PracticeProfile();
        live.name = scanner.next();
        live.points = scanner.nextInt();
        PracticeProfile alias = live;
        int boost = scanner.nextInt();
        alias.points += boost;

        if (alias.points > 100) {
            alias.points = 100;
        }

        PracticeProfile checkpoint = new PracticeProfile();
        checkpoint.name = live.name;
        checkpoint.points = live.points;
        int correction = scanner.nextInt();
        live.points = live.points - correction;
        if (live.points < 0) {
            live.points = 0;
        }
        System.out.println("Live: " + live.name + " " + live.points);
        System.out.println("Alias: " + alias.name + " " + alias.points);
        System.out.println("Checkpoint: " + checkpoint.name + " " + checkpoint.points);

        scanner.close();
    }
}
