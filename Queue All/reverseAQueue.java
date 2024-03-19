import java.util.*;

public class reverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.peek());
            q.poll();
        }
        while(!st.empty()){
            q.add(st.peek());
            st.pop();
        }
        System.out.println(q);

    }
}
