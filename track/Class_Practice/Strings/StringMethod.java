package track.Class_Practice.Strings;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "Java";
        String s4 = new String("java");
        String s5 = new String("java");
        if (s1.equals(s2)) {
            System.out.println("s1 equal s2");
        }
        if (s1.equals(s3)) {
            System.out.println("s1 equal s3");
        }
        if (s1.equals(s4)) {
            System.out.println("s1 equal s4");
        }
        if (s1.equals(s5)) {
            System.out.println("s1 equal s5");
        }
        if (s1 == s2) {
            System.out.println("s1 references are same as s2");
        } else {
            System.out.println("s1 references are not same as s2");
        }

        if (s4 == s5) {
            System.out.println("s4 references are same as s5");
        } else {
            System.out.println("s4 references are not same as s5");
        }
        if (s1 == s3) {
            System.out.println("s1 references are same as s3");
        } else {
            System.out.println("s1 references are not same as s3");
        }

        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("s1 values are equal to s3");
        }
    }

}
