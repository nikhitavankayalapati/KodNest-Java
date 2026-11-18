package track.Class_Practice.Thread;

public class pgm1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Nikki");
        System.out.println(t.getName());
        t.setPriority(4);
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());
        System.out.println(t.getClass());
        System.out.println(t);

    }

}
