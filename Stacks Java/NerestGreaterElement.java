import java.util.Stack;

public class NerestGreaterElement {
    public static int[] NextGreaterToRight(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(st.size()==0){
                ans[i] = -1;
            }
            else if(st.size()>0 && arr[i]<st.peek()){
                ans[i] = st.peek();
            }
            else if(st.size()>0 && arr[i]>=st.peek()){
                while(st.size()>0 && arr[i]>=st.peek()){
                    st.pop();
                }
                if(st.size()==0){
                    ans[i] = -1;
                }
                else{
                    ans[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static int[] NextGreaterToRight2(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            ans[i] = -1;
            while(!st.empty() && arr[st.peek()]<arr[i]){
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }

    public static int[] NextGreater2(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<2*n; i++){
            ans[0] = -1;
            while(!st.empty() && arr[st.peek()]<arr[i%n]){
                ans[st.peek()] = arr[i%n];
                st.pop();
            }
            if(i<n){
                st.push(i);
            }
        }
        return ans;
    }

    public static int[] NextgreaterToLeft(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(st.size()==0){
                ans[i] = -1;
            }
            else if(st.size()>0 && st.peek()>arr[i]){
                ans[i] = st.peek();
            }
            else if(st.size()>0 && st.peek()<=arr[i]){
                while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    ans[i] = -1;
                }
                else{
                    ans[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] ans = NextGreater2(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
