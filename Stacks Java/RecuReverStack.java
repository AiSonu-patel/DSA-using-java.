import java.util.Stack;

public class RecuReverStack {

    public static void InsertAtBottom(Stack<Integer> st, int val){
        if(st.size()==0){
            st.push(val);
            return;
        }
        int top = st.pop();
        InsertAtBottom(st, val);
        st.push(top);
    }

    public static void Reverse(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        int top = st.pop();
        Reverse(st);
        InsertAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
}
