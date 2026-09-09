package track.M04.T01;

import java.util.Scanner;

public class ReadCourseDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String course = sc.nextLine();
        String trainer = sc.nextLine();

        System.out.println("Course: " + course);
        System.out.println("Trainer: " + trainer);

        sc.close();
    }
}