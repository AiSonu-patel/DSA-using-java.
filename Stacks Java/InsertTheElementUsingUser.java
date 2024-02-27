import java.util.Stack;
import java.util.Scanner;

public class InsertTheElementUsingUser {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> st = new Stack<>();
            System.out.println("Enter the number of elements : ");
            int n = sc.nextInt();
            System.out.println("Enter the Number");
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                st.push(x);
            }
            System.out.println(st);
        }
    }
}
