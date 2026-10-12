package track.Class_Practice.OOPS;

import java.util.*;

public class EqualsOverride {
    static class Student {
        int roll;
        String name;

        Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }

        @Override 
        public boolean equals(Object obj) {
            Student s = (Student) obj;
            if (this.roll == s.roll && this.name.equals(s.name)) {
                return true;
            } else {
                return false;
            }
        }
        @Override 
        public int hashCode(){
            return Objects.hash(roll,name);
        }
        @Override 
        public String toString(){
            return "Roll no: "+this.roll+" Name: "+this.name;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "nikhita");
        Student s2 = new Student(1, "nikhita");
        Student s3 = new Student(2, "nicky");
        Object s4 = new Student(22,"Ram");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.toString()); // Roll no: 1 Name: nikhita
        System.out.println(s2.toString()); // Roll no: 1 Name: nikhita
        System.out.println(s3.toString()); // Roll no: 2 Name: nicky
        System.out.println(s4.toString()); // Roll no: 22 Name: Ram
        System.out.println(s4.getClass()); // class track.Class_Practice.OOPS.EqualsOverride$Student
        System.out.println(s1.hashCode()); // 1949238558
        System.out.println(s2.hashCode()); // 1949238558
        System.out.println(s3.hashCode()); // 104814965
        System.out.println(s4.hashCode()); // 83561
    }
}

/*
Output:
true
false
Roll no: 1 Name: nikhita
Roll no: 1 Name: nikhita
Roll no: 2 Name: nicky
Roll no: 22 Name: Ram
class track.Class_Practice.OOPS.EqualsOverride$Student
1949238558
1949238558
104814965
83561
*/

