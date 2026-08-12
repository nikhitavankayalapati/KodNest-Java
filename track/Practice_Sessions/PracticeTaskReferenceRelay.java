package track.Practice_Sessions;

import java.util.Scanner;

class PracticeTask {
    int id;
}

public class PracticeTaskReferenceRelay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PracticeTask first = new PracticeTask();
        first.id = sc.nextInt();

        PracticeTask second = new PracticeTask();
        second.id = sc.nextInt();

        PracticeTask third = new PracticeTask();
        third.id = sc.nextInt();

        // 1. Store the first object's ID
        int unreachableId = first.id;

        // 2. Create relay and assign first to it
        PracticeTask relay = first;

        // 3. Assign second to first
        first = second;

        // 4. Assign third to second
        second = third;

        // 5. Assign second to relay
        relay = second;

        // 6. Assign first to third
        third = first;
    }
}