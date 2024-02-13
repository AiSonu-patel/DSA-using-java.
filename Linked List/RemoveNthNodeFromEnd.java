public class RemoveNthNodeFromEnd {
    /*
     * Removeing Nth Node frome the end of linked List in one traversal
     */
    public static Node NthNodeFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void printNode(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
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
        printNode(a); // 100 4 13 12 16 10
        a = NthNodeFromEnd(a, 6);
        printNode(a); // 100 4 13 12 10
    }
}
