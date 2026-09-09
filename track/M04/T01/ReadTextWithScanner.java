package track.M04.T01;

import java.util.*;

public class ReadTextWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String city = scanner.nextLine();

        System.out.println("Name: " + learnerName + "\nCity: " + city + "\nName length: " + learnerName.length());
        scanner.close();
    }
}
