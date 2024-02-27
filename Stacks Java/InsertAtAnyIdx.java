import java.util.Stack;
public class InsertAtAnyIdx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(8);
        st.push(9);
        st.push(7);
        System.out.println(st);

        int idx = 2;
        int val = 4;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
       }
}
