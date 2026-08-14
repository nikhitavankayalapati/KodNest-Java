package track.Class_Practice;

class Student {
    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
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

public class ConstructorStudentApplication {

    public static void main(String[] args) {
        Student s = new Student("Raja", 10, 5.0);
        s.display();

    }

}
