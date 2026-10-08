package track.Class_Practice.Strings;

public class StringBuilderProgram {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.capacity()); 
        System.out.println(sb.length()); 
        sb.append(" World");
        System.out.println(sb.capacity()); 
        System.out.println(sb.length()); 
        sb.ensureCapacity(100);
        System.out.println(sb.capacity()); 
        System.out.println(sb.length()); 
        sb.append(" Welcome to KodNest");
        System.out.println(sb.capacity()); 
        System.out.println(sb.length()); 
    }
}
