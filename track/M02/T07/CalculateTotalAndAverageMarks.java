package track.M02.T07;

public class CalculateTotalAndAverageMarks {
    public static void main(String[] args) {
        int marks[] = { 70, 80, 60, 90, 50 };
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("Total: " + total);
        System.out.printf("Average: " + (double) (total / marks.length));

    }

}