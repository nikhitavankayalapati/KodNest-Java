package track.Class_Practice.OOPS;
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    void sleep(){
        System.out.println("Animal sleeps");
    }
}
// Monkey Class
class Monkey extends Animal {
    @Override
    void eat() {
        System.out.println("Monkey steals and eats");
    }
}

// Tiger Class
class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger hunts and eats");
    }
}

// Main Application
public class AnimalApp {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.eat();
        m.sleep(); // Inherited from Animal class
        
        Tiger t = new Tiger();
        t.eat();
        t.sleep(); // Inherited from Animal class
    }
}
