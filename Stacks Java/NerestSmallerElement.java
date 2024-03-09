import java.util.Stack;

/**
 * NerestSmallerElement
 */
public class NerestSmallerElement {

    public static int[] NextSmallerToLeft(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(st.size()==0){
                ans[i] = -1;
            }
            else if(st.size()>0 && st.peek()<arr[i]){
                ans[i] = st.peek();
            }
            else if(st.size()>0 && st.peek()>=arr[i]){
                while(st.size()>0 && st.peek()>=arr[i]){
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

    public static int[] NextSmallerToRight(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(st.size()==0){
                ans[i] = -1;
            }
            else if(st.size()>0 && st.peek()<arr[i]){
                ans[i] = st.peek();
            }
            else if(st.size()>0 && st.peek()>=arr[i]){
                while(st.size()>0 && st.peek()>=arr[i]){
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
        int[] arr = {4,8,5,2,3,6,9,1};
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] ans = NextSmallerToLeft(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        int[] ans2 = NextSmallerToRight(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(ans2[i]+" ");
        }
    }
}