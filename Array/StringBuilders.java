// import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sonu");

        System.out.println(sb); // Sonu

        // Char at index 0
        System.out.println(sb.charAt(0)); // S

        //set char at index 0
        sb.setCharAt(0, 'M');
        System.out.println(sb); // Monu

        // insert char at index 0
        sb.insert(0, '@');
        System.out.println(sb); // @Monu

        //Delete the @ char
        sb.delete(0, 1);
        System.out.println(sb); // Monu

        // add the new char using append
        sb.append(" ");
        sb.append("K");
        sb.append("u");
        sb.append("m");
        sb.append("a");
        sb.append("r");
        System.out.println(sb); // Monu Kumar

        // print the string length
        System.out.println(sb.length()); // 10
        

    }
}
