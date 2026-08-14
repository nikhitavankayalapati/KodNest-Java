package track.Practice_Sessions;

class Conductor {
    void collect(Money m) {
        System.out.println("Money collected by conductoder");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket Issued");
        return t;
    }
}

class Money {
    int amount;

    Money(int amount) {
        this.amount = amount;
    }

    Money() {
    }
}

class Ticket {
}

public class Passenger {
    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Money(50);
        c.collect(m);
        Ticket t = c.give();
        System.out.println(t);
        if (t != null) {
            System.out.println("Ticket collected");
        }
    }

}
