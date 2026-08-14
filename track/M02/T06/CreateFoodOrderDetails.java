package track.M02.T06;

import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    // Constructor 1
    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    // Constructor 2 - overloaded constructor
    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class CreateFoodOrderDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item = sc.nextLine();
        int quantity = sc.nextInt();

        FoodOrder fd = new FoodOrder(item, 1);
        FoodOrder fd1 = new FoodOrder(item, quantity);

        fd.display();
        fd1.display();

        sc.close();
    }
}