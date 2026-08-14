package track.M02.T06;

import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    // Default constructor
    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    // Parameterized constructor
    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class CreateMobilePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String planName = sc.next();
        int price = sc.nextInt();

        MobilePlan mp1 = new MobilePlan();
        MobilePlan mp2 = new MobilePlan(planName, price);

        mp1.display();
        mp2.display();
        sc.close();
    }
}