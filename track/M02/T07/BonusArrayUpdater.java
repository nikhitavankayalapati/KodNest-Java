package track.M02.T07;

public class BonusArrayUpdater {
    public static void main(String[] args) {

        int[] values = { 10, 20, 30, 40, 50 };
        int bonus = 5;

        System.out.print("Updated values: ");

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] + bonus;
            System.out.print(values[i] + " ");
        }
    }
}