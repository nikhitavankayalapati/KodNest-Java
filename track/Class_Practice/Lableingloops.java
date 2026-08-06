package track.Class_Practice;

public class Lableingloops {
    public static void main(String[] args) {
        outer: for (int i = 1; i < 4; i++) {
            Inner: for (int j = 1; j < 5; j++) {
                if (i == 2) {
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("printing without labling");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }

    }

}
