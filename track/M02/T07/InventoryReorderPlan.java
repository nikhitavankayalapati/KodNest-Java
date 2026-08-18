package track.M02.T07;

public class InventoryReorderPlan {
    public static void main(String[] args) {
        int[] stock = { 4, 12, 2, 9, 5 };
        int reorderLevel = 5, reorderCount = 0;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] <= reorderLevel) {
                reorderCount += 1;
            }
        }
        System.out.println("Items to reorder: " + reorderCount);

    }

}