package track.Practice_Sessions.DSE.Assesment_2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String labels = sc.next();
        System.out.println(minLabelChanges(labels));
        sc.close();
    }

    public static int minLabelChanges(String labels) {
        int l = 0;
        int r = labels.length() - 1;
        int count = 0;
        while (l < r) {
            if (labels.charAt(l) != labels.charAt(r)) {
                count++;
            }
            l++;
            r--;
        }
        return count;
    }
}