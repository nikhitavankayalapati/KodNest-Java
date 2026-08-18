package track.M02.T07;

public class DebugAndTraceArray {
    public static void main(String[] args) {

        int[] original = { 14, 18, 22, 26 };
        int updateIndex = 1;
        int updateValue = 25;
        int requestIndex = 4;

        int[] snapshot = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;

        if (updateIndex >= 0 && updateIndex < original.length) {
            liveView[updateIndex] = updateValue;
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.print("\nSnapshot: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(snapshot[i] + " ");
        }

        System.out.println("\nSame object: " + (liveView == original));

        if (requestIndex >= 0 && requestIndex < original.length) {
            System.out.println("Requested value: " + original[requestIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}