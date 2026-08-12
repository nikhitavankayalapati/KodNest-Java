package track.Practice_Sessions;

import java.util.Scanner;

class PracticeTask {
    int id;
}

public class ObjectReferenceRelay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PracticeTask pt1 = new PracticeTask();
        PracticeTask pt2 = new PracticeTask();
        PracticeTask pt3 = new PracticeTask();

        pt1.id = sc.nextInt();
        pt2.id = sc.nextInt();
        pt3.id = sc.nextInt();

        int unreachable = pt1.id;

        PracticeTask relay = pt1;

        pt1 = pt2;
        pt2 = pt3;
        relay = pt2;
        pt3 = pt1;

        System.out.println("First Reference: " + pt1.id);
        System.out.println("Second Reference: " + pt2.id);
        System.out.println("Third Reference: " + pt3.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachable);
        sc.close();
    }
}