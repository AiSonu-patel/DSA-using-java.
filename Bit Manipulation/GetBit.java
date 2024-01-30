public class GetBit {
    public static void main(String[] args) {
        // Get the 3rd bit (position = 2) of a number n. (n = 0101)
        //1. Bit Mask: i<<i
        //2. Operation: AND
        int n = 5;
        int position = 3;
        int bitMask = 1<<position;

        if((bitMask & n) == 0){
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}