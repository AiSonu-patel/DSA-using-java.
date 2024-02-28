import java.util.Stack;

public class ReverseStack {
    public static void Reverse(Stack<Integer> st){
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
            st1.push(st.pop());
        }
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        while(st2.size()>0){
            st.push(st2.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
}
