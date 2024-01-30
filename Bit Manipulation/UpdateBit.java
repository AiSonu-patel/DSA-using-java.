import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        // Update The 2nd bit (Position = 1) of a number n to 1. (n = 0101)

        // for 0:
        // 1. bit Mask: 1<<i
        // 2. operation: AND with NOT

        // for 1:
        // 1. bit Mask: 1<<i
        // 2. operation: OR
        try (Scanner sc = new Scanner(System.in)) {
            int operation = sc.nextInt();
            int n = 5;
            int position = 1;

            int bitMask = 1 << position;
            if (operation == 1) {
                int newbitMask = bitMask | n;
                System.out.println(newbitMask);
            } else {
                int NotBitMask = ~(bitMask);
                int newbitMask = NotBitMask & n;
                System.out.println(newbitMask);
            }

        }
    }
}
