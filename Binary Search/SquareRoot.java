public class SquareRoot {
    /*
     * Find the square root of the given non negative value x.Round it off to the nearest floor integer value.
     * 
     * Inpute: x = 4
     * Output: 2
     * 
     * Inpute: x = 11
     * Output: 3
     */

     public static int sqrt(int x){
        int st = 0, end = x;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            int valu = mid*mid;

            if(valu == x){
                return mid;
            } else if(valu < x){
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
     }

    public static void main(String[] args) {
        int x = 24;
        System.out.println(sqrt(x));
    }
}
