import java.util.*;

public class ConvertUpper {

    /*
     * Given a string, the task is to toggle all the characters of string i.e to
     * convert upper case to lower case
     * and vice versa.
     * 
     * input: PhysICS
     * Output: PHYSics
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the String : ");
            StringBuilder str = new StringBuilder(sc.nextLine());
            System.out.println(str);
            // toggle
            // palindromic
            for (int i = 0; i < str.length(); i++) {
                boolean flag = true;
                char ch = str.charAt(i);
                if (ch == ' ')
                    continue;
                int asci = (int) ch;
                if (asci >= 97)
                    flag = false;
                if (flag == true) {
                    asci += 32;
                    char dh = (char) asci;
                    str.setCharAt(i, dh);
                } else {
                    asci -= 32;
                    char dh = (char) asci;
                    str.setCharAt(i, dh);
                }
            }
            System.out.println(str);
        }
    }
}
