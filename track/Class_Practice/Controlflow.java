package track.Class_Practice;

public class Controlflow {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 6) {
                continue; // skips 6
            }
            System.out.println(i);
            if (i == 9) {
                break; // stops the loop when i becomes 9
            }
        }
    }

}
