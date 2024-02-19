public class TwinSumMaximumLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head) {
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static Node reverse(Node head){
        Node pre = null;
        Node curr = head;
        Node after = null;
        while(curr!=null){
            after = curr.next;
            curr.next = pre;
            pre = curr;
            curr = after;
        }
        return pre;
    }
    public static int twinSum(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        temp.next = head;
        Node p1 = head;
        Node p2 = slow.next;
        int MaxSum = 0;
        while(p2!=null){
            int sum = p1.data + p2.data;
            if(MaxSum<sum){
                MaxSum = sum;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        System.out.println(twinSum(a));
    }
}
