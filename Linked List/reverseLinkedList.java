public class reverseLinkedList {
    public static class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
    }
    public static Node reverse2(Node head){
        Node pre = null;
        Node curr = head;
        Node aft = null;
        while(curr!=null){
            aft = curr.next;
            curr.next = pre;
            pre = curr;
            curr = aft;
        }
        return pre;
    }
    public static Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void displayRev(Node head) {
        if(head==null){
            return;
        }
        displayRev(head.next);
        System.out.print(head.val+" ");
    }
    public static void display(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.val+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // display(a);
        // System.out.println();
        // displayRev(a);
        a = reverse2(a);
        display(a);
    }
}
