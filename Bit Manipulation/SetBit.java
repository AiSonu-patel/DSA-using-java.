public class SetBit {
    public static void main(String[] args) {
        // Set the 2nd (Postion = 1) of a number n. (n = 0101)
        //1. Bit Mask: 1<<i
        //2. Operation: OR
        int n = 5;
        int postion = 1;
        int bitMask = 1<<postion;

        int newbitMask = bitMask | n;
        System.out.println(newbitMask);
    }
}
