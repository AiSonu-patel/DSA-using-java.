public class sumOfNaturalNum {
    public static void printSum(int i, int n, int sum) {
        //base case
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        //small problem
        sum += i;
        //recursion
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }   
}
