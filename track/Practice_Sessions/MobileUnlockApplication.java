package track.Practice_Sessions;

class Mobile {
    int pin;
    String password;
    boolean faceId;
    boolean fingerprint;

    Mobile(int pin) {
        this.pin = pin;
    }

    Mobile(String password) {
        this.password = password;
    }

    Mobile(boolean faceId, boolean fingerprint) {
        this.faceId = faceId;
        this.fingerprint = fingerprint;
    }
}

class LockScreen {
    Mobile m;

    LockScreen(Mobile m) {
        this.m = m;
    }

    void check(int pin) {
        if (m.pin == pin) {
            System.out.println("Unlocked");
        } else {
            System.out.println("Wrong pin");
        }
    }

    void check(String password) {
        if (m.password != null && m.password.equals(password)) {
            System.out.println("Unlocked");
        } else {
            System.out.println("Wrong password");
        }
    }

    void check(boolean faceId, boolean fingerprint) {
        if (m.faceId == faceId && m.fingerprint == fingerprint) {
            System.out.println("Unlocked");
        } else {
            System.out.println("Wrong biometric authentication");
        }
    }
}

class Keypad {

}

public class MobileUnlockApplication {
    public static void main(String[] args) {
        Mobile m = new Mobile(1234);
        LockScreen ls = new LockScreen(m);
        ls.check(1234);
    }
}