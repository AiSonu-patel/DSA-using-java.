public class LLImplementationOfStack {
    public static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LLStack{
        private Node head = null;
        private int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.print("Stack is Empty!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.print("Stack is Empty!");
                return -1;
            }
            return head.data;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
        void displayrec(Node h){
            if(h==null){
                return;
            }
            displayrec(h.next);
            System.out.print(h.data+" ");

        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(8);
    }
}
