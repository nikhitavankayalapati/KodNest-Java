package track.Class_Practice;

class Student {

    // Instance variables
    String name;
    int age;
    double height;

    // Parameter variables
    void input(String name, int age, double height) {

        // Assigning parameter values to instance variables
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApplication {

    public static void main(String[] args) {

        Student s = new Student();

        s.input("Raja", 18, 5.5);
        s.display();
    }
}