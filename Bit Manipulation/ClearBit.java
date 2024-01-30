public class ClearBit {
    public static void main(String[] args) {
        // Clear bit 3rd bit (position = 2) of a number n. (n = 0101)
        //1. bit Mask: 1<<i
        //2. Operation: AND with NOT

        int n = 5;
        int position = 2;
        int bitMask = 1<<position;
        int NotBitMask = ~(bitMask);

        int newbitMask = (NotBitMask & n);
        System.out.println(newbitMask);
    }
}
