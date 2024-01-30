import java.util.*;

public class Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the your FName: ");
            String fName = sc.nextLine();
            System.out.println("Enter the your LName: ");
            String lName = sc.nextLine();
            String FullName = fName + " " + lName;
            // System.out.println(FullName);

            for (int i = 0; i < FullName.length(); i++) {
                System.out.println(FullName.charAt(i));
            }
        }
    }
}
