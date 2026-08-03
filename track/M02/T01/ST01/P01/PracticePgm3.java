package track.M02.T01.ST01.P01;

public class PracticePgm3 {
    public static void main(String[] args) {

        // Fixed values
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;

        double weight = 72.0;
        double height = 1.8;

        int mark1 = 78;
        int mark2 = 84;
        int mark3 = 69;
        int mark4 = 91;
        int mark5 = 88;

        // Calculations
        double simpleInterest = principal * rate * time / 100.0;
        double totalAmount = principal + simpleInterest;

        double bmi = weight / (height * height);

        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = totalMarks * 100.0 / 500;

        // Output
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}
