public class LLImplementationOfQueue {

    public static class Node{
        int data;
        Node  next;
        Node(int data){
            this.data = data;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node temp  = new Node(x);
            if(size==0){
                head = tail = temp;
            }
            tail.next = temp;
            tail = temp;

            size++;
        }

        public int peek(){
            if(size==0){
                return -1;
            }
            return head.data;
        }

        public int remove(){
            if(size==0){
                return -1;
            }
            int v = head.data;
            head = head.next;

            size--;

            return v;
        }

        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
    }
}
