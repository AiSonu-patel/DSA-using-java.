import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size()); // 5

        System.out.println(q); // 1 2 3 4 5
        q.remove();
        System.out.println(q); // 2 3 4 5
        q.poll();
        System.out.println(q); // 3 4 5
        System.out.println(q.element()); // 3
        System.out.println(q.peek()); // 3
        System.out.println(q.isEmpty());
    }
}