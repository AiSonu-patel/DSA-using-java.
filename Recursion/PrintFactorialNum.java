public class PrintFactorialNum {
    public static int calcFactorial(int n) {
        //base case
        if(n == 1 || n == 0){
            return 1;
        }
        //recursion
        int fact_nm1 = calcFactorial(n-1);
        //small problem
        int cal_fact = fact_nm1 * n;
        return cal_fact;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}
