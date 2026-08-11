package track.Class_Practice;

class Employee {
    int empid;
    String Name;
}

public class EmployeeApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empid = 101;
        e1.Name = "nikhita";
        System.out.println(e1.empid);
        System.out.println(e1.Name);
        Employee e2 = e1;
        e2.empid = 17;
        e2.Name = "harshini";
        System.out.println(e1.empid);
        System.out.println(e1.Name);
        System.out.println(e2.empid);
        System.out.println(e2.Name);
    }

}
