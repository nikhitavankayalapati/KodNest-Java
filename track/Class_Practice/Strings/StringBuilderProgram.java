package track.Class_Practice.Strings;

public class StringBuilderProgram {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.capacity()); // 21
        System.out.println(sb.length()); // 5
        sb.append(" World");
        System.out.println(sb.capacity()); // 21
        System.out.println(sb.length()); // 11
        sb.ensureCapacity(100);
        System.out.println(sb.capacity()); // 100
        System.out.println(sb.length()); // 11
        System.out.println(sb.capacity()); // 100
        System.out.println(sb.length()); // 11
        sb.append(" Welcome to KodNest");
        System.out.println(sb.capacity()); // 100
        System.out.println(sb.length()); // 30
    }
}
