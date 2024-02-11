/**
 * Basicsll
 */
public class Basicsll {
    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }
    public static void printUsRec(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        printUsRec(head.next);
    }
    public static void printNode(Node head){
        // Node temp = head;
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
        // or
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5); //head node
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(16); // tail
        // 5 3 7 9 16
        a.next = b; // 5 -> 3 7 9 16
        b.next = c; // 5 -> 3 -> 7 9 16
        c.next = d; // 5 -> 3 -> 7 -> 9 16
        d.next = e; // 5 -> 3 -> 7 -> 9 -> 16
        //print the node element
        // Node temp = a;
        // for(int i=0; i<=5; i++){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
        //or
        // Node temp = a;
        // while(temp!=null){ // printing the list
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
        //or 
        printUsRec(a);
        // System.out.println("\nLeagth :"+length(a));
        
        insertAtEnd(a, 87);
        printNode(a);
    }
}