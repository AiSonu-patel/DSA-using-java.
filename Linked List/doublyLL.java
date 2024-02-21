/**
 * doublyLL
 */
public class doublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node randome){
        Node temp = randome;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void reverse(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node head, int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAtIdx(Node head, int idx, int val){
        Node s = head;
        for(int i=1; i<=idx-1; i++){
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(val);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }
    public static Node deleteHead(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }
    public static Node deleteTail(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static void deleteTail2(Node tail){
        tail = tail.prev;
        tail.next = null;
    }
    public static Node deleteAtIdx(Node head, int idx){
        Node temp = head;
        if(idx==1){
            head = head.next;
            head.prev = null;
        }
        for(int i=1; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return head;

    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(7);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(9);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        Node h = deleteAtIdx(a, 1);
        display(h);
        // Node h = deleteTail(a);
        // display(h);
        // deleteTail2(e);
        // display(a);
        // deleteAtIdx(a, 3);
        // display(a);
        // insertAtIdx(a, 3, 10);
        // display(a);
        // Node ab = deleteHead(a);
        // display(ab);
        // displayRev(e);
        // display2(c);
        // reverse(a);
        // Node newHead = insertAtHead(a, 35);
        // display(newHead);

    
    }
}