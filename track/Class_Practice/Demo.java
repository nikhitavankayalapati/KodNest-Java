package track.Class_Practice;

class ArraySearch {
    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == key) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }
    }
}

class Demo {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        ArraySearch as = new ArraySearch();
        as.search(arr, 30);
    }
}