package track.Class_Practice;

public class looppractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            if (i == 2) {
                continue;
            }
            for (int j = 1; j <= 2; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }

}
