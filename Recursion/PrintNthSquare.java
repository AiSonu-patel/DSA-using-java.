public class PrintNthSquare {
    public static int calcSquar(int x, int n){
        // Print x^n (stack height = n)
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int cal_nm1 = calcSquar(x, n-1);
        int cal_num = cal_nm1 * x;
        return cal_num;
    }

    public static int calcSq(int x, int n){
        // Print x^n (stack height = long)

        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        // if is even
        if(n%2 == 0){
            return calcSq(x, n/2) * calcSq(x, n/2);
        } else {
            return calcSq(x, n/2) * calcSq(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcSquar(x, n);
        System.out.println(ans);
    }
}
