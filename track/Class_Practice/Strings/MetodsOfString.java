package track.Class_Practice.Strings;

public class MetodsOfString {
    public static void main(String[] args) {
        String s1 = "KodNest Technologies";
        String s2 = "";
        String s3 = " ";
        System.out.println(s1.length()); // 20
        System.out.println(s2.length()); // 0
        System.out.println(s3.length()); // 1
        System.out.println(s1.toLowerCase()); // kodnest technologies
        System.out.println(s1.toUpperCase()); // KODNEST TECHNOLOGIES
        System.out.println(s1.isEmpty()); // false
        System.out.println(s3.isEmpty()); // false
        System.out.println(s2.isEmpty()); // true
        System.out.println(s1.isBlank()); // false
        System.out.println(s3.isBlank()); // true
        System.out.println(s2.isBlank()); // true
        System.out.println(s1.trim()); // KodNest Technologies
        System.out.println(s1.replace("e", "A")); // KodNAst TAchnologiAs
        System.out.println(s1.startsWith("KodNest")); // true
        System.out.println(s1.endsWith("technologies")); // false
        System.out.println(s1.indexOf("Technologies")); // 8
        System.out.println(s1.indexOf("kodNest")); // -1
        System.out.println(s1.indexOf("Technologies", 2)); // 8
        System.out.println(s1.lastIndexOf("e")); // 15
        System.out.println(s1.lastIndexOf("kodNest")); // -1
        System.out.println(s1.lastIndexOf("Technologies", 2)); // -1
        System.out.println(s1.contains("Technologies")); // true
        System.out.println(s1.contains("kodNest")); // false
        System.out.println(s1.substring(0, 4)); // KodN
        System.out.println(s1.substring(12, 14)); // no

    }

}
