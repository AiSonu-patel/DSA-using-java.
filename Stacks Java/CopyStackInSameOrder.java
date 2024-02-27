import java.util.Stack;

public class CopyStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // reverse order
        Stack<Integer> hel = new Stack<>();
        while(st.size() > 0){
            // int x = st.peek();
            // rt.push(x);
            // st.pop();

            hel.push(st.pop());
        }
        Stack<Integer> dec = new Stack<>();
        while(hel.size()>0){
            int x = hel.peek();
            dec.push(x);
            hel.pop();
        }
        System.out.println(dec);
    }
}
