public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){ // empty list
                head = temp;
                tail = temp;
            } else{ // npn empty list
                temp.next = head;
                head = temp;
            }
        }
        void inserAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }else if(idx==0){
                insertAtHead(val);
                return;
            } else if(idx<0 || idx>size()){
                System.out.println("worng index");
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int idx){
        if(idx<0 || idx>size()){
            System.out.println("worng index");
            return -1;
        }
            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            Node temp = head;
            if(idx==0){
                head = head.next;
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4); // 4
        // ll.display();
        ll.insertAtEnd(7); // 4 7
        // ll.display();
        ll.insertAtEnd(8);
        // ll.display(); // 4 7 8
        ll.insertAtHead(13);
        // ll.display(); // 13 -> 4 -> 7 -> 8
        ll.inserAt(1, 9);
        // ll.display(); // 13 -> 9 -> 4 -> 7 -> 8
        ll.inserAt(0, 100); 
        ll.display(); // 100 -> 13 -> 9 -> 4 -> 7 -> 8

        ll.deleteAt(2);
        ll.display(); // 100 -> 13 -> 4 -> 7 -> 8

        // System.out.println(ll.getAt(3)); // 4
        // System.out.println(ll.size()); //6
        
    }
}
