package track.Class_Practice.Static;

public class BasicProgram {

    static int a;
    static int b;
    int p, q;
    static {
        System.out.println("Inside static");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Inside non static");
        p = 100;
        q = 200;
    }

    static void display() {
        System.out.println("Inside static-Method");
        System.out.println(a);
        System.out.println(b);
    }

    void display2() {
        System.out.println("Inside non- static");
        System.out.println(p);
        System.out.println(q);
    }

    public static void main(String[] args) {
        BasicProgram pg = new BasicProgram();
        display();
        BasicProgram.display();
        pg.display2();
    }
}
