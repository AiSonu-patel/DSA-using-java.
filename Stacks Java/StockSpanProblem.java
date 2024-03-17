import java.util.*;

public class StockSpanProblem {

    public static int[] NerestgreaterToLeft(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.empty() && arr[i]>arr[st.peek()]){
                ans[st.peek()] = st.peek()-i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            ans[st.peek()] = st.peek()+1;
            st.pop();
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 55, 70, 60, 75, 85 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] ans = NerestgreaterToLeft(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
