package track.Practice_Sessions.DSE.Assesment_2;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String route = sc.next();
        String priority = sc.next();
        int k = sc.nextInt();
        System.out.println(validRoute(route, priority, k) ? "VALID" : "INVALID");
        sc.close();
    }

    public static boolean validRoute(String route, String priority, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < route.length(); i++) {
            freq.put(route.charAt(i), i);
        }
        int index = 0;
        for (int i = 1; i < priority.length(); i++) {
            if (freq.get(priority.charAt(i)) - freq.get(priority.charAt(index)) - 1 != k) {
                return false;
            }
            index++;

        }
        return true;
    }
}