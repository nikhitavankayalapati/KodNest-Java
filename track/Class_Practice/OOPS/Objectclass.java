package track.Class_Practice.OOPS;
class Student{
    int roll;
    String name;
    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println("Roll no: "+this.roll);
        System.out.println("Name: "+this.name);
    }

}

public class Objectclass {
    public static void main(String[] args) {
        Student s1=new Student(2,"nikhita");
        Student s2=new Student(1,"sreeja");
        Student s3=new Student(1,"sreeja");

        s1.display();
        s2.display();
        s3.display();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        // equals method is a method in object class
        //if there is no parent class object class becomes the parent class
        //equals checks the reference but in 
        // string class they override the equals metod 
        // to check charecters in string are equal or not
        // if we want to compare objects we can override the equals method
        
    }
}