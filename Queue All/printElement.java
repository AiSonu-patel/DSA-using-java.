import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class printElement {
    public static void main(String[] args) {
        // print all the elements present in the given queue.

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> helper = new ArrayDeque<>();
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            int x = q.poll();
            helper.add(x);
        }

        while(!helper.isEmpty()){
            q.add(helper.poll());
        }
    }
}
