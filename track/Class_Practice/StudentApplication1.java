package track.Class_Practice;

class Student {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
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

public class StudentApplication1 {

    public static void main(String[] args) {
        Student s = new Student();
        s.input("Raja", 10, 5.0);
        s.display();

    }

}
