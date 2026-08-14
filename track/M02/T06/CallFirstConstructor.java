package track.M02.T06;

class Robot {
    Robot() {
        System.out.println("Beep beep! Robot reporting for Java duty!");
    }
}

public class CallFirstConstructor {
    public static void main(String[] args) {
        Robot r = new Robot();
    }
}