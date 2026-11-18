package track.Class_Practice.Thread;

import java.util.*;

class Addition implements Runnable {
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Addition activity started..?");
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        int res = a + b;
        System.out.println("Addition result is: " + res);
        System.out.println("Addition activity completed..?");
    }
}

class PrintNum implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing num activity started..?");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing num activity completed..?");
    }
}

class PrintChar implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing char activity started..?");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing char activity completed..?");
    }
}

public class RunnableActivity {
    public static void main(String[] args) {
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();
        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(pn);
        Thread t3 = new Thread(pc);
        t1.start();
        t2.start();
        t3.start();
    }

}
