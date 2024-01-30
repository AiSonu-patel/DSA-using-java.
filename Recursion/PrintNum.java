/**
 * PrintNum
 */
public class PrintNum {
    //print numbers from 5 to 1
    public static void PrintNumbers(int n){
        // base case
        if(n == 0){
            return;
        }
        //small problem
        System.out.println(n);
        //recursion
        PrintNumbers(n-1);
    }
    
    //print numbers from 1 to 5
    public static void numbers(int n) {
        // base case
        if(n > 5){
            return;
        }
        //small problem
        System.out.println(n);
        //recursion
        numbers(n+1);
    }
    
    public static void main(String[] args) {
        int n = 1;
        // PrintNumbers(n);
        numbers(n);
    }
}