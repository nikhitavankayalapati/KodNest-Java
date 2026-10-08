package track.Class_Practice.OOPS;
class ChainingParent {
    int a = 10;

    void disp() {
        System.out.println("Parent's a: " + a);
    }
}

class ChainingChild extends ChainingParent {
    int a = 20;

    void disp2() {
        System.out.println("Child's a: " + a);
        System.out.println("Parent's a using super: " + super.a);
    }
}

public class ChainingApplication {
    public static void main(String[] args) {
        ChainingChild c = new ChainingChild();
        c.disp2();
    }
}