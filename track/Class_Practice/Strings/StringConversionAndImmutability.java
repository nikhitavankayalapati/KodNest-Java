
package track.Class_Practice.Strings;

public class StringConversionAndImmutability {
    public static void main(String[] args) {
        String s1 = "Java";
        String res = s1.toUpperCase();
        System.out.println(res); // JAVA
        System.out.println(s1); // Java

        String s2 = "Programming";
        String s3 = s1 + s2;
        System.out.println(s3); // JavaProgramming

        String t1 = new String("Anu");
        String t2 = new String("Bhanu");
        String ans = t1.concat(t2);
        System.out.println(ans); // AnuBhanu

        char[] ch = s1.toCharArray();
        System.out.println(ch); // Java
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]); // J, a, v, a (each on a new line)
        }
        String merge = new String(ch);
        System.out.println(merge); // Java

        byte[] b = s1.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]); // 74, 97, 118, 97 (each on a new line)
        }
        String data = new String(b);
        System.out.println(data); // Java
    }
}