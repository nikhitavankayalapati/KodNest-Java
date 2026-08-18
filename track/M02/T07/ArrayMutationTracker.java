package track.M02.T07;

public class ArrayMutationTracker {
    public static void main(String[] args) {
        int[] readings = { 12, 14, 16, 18 };
        int updateIndex = 2, newValue = 25;
        int[] snapshot = new int[readings.length];
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
            if (i == updateIndex) {
                readings[i] = newValue;

            }

        }

        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.print("\nUpdated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");

        }

    }

}
