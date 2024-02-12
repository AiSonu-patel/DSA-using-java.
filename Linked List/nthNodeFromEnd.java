public class nthNodeFromEnd {
    /*
     * Finding Nth node from the end of linked list?
     */
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for(int i=1; i<=m-1; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head, int x){
        Node fast = head;
        Node slow = head;
        for(int i=1; i<=x; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(4);
        Node c = new Node(13);
        Node d = new Node(12);
        Node e = new Node(16);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node q = nthNode(a, 3);
        System.out.println(q.data); // 12
        Node s = nthNode2(a, 2);
        System.out.println(s.data); // 16
    }
}
