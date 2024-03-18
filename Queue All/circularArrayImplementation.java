public class circularArrayImplementation {

    public static class CQueue{
        int[] arr = new int[5];
        int front = -1;
        int rear = -1;
        int size = 0;

        public void add(int x) throws Exception {
            if(size == arr.length){
                throw new Exception("Queue is full!");
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = x;
            }
            else if(rear<arr.length-1){
                arr[++rear] = x;
            }
            else if(rear==arr.length-1){
                rear = 0;
                arr[0] = x;
            }
            size++;
        }

        public int remove() throws Exception {
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            else {
                int v = arr[front];
                if(front==arr.length-1){
                    front = 0;
                }
                else {
                    front++;
                }
                size--;
                return v;
            }
        }

        public int peek() throws Exception {
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            return arr[front];
        }

        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            else if(front<=rear){
                for(int i=front; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{ // rear < front
                for(int i=front; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        CQueue cq = new CQueue();
        cq.display();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.display(); // 1 2 3 4
        cq.remove();
        cq.display(); //   2 3 4
        cq.add(5);
        cq.display(); //   2 3 4 5
        cq.add(6); // 6 2 3 4 5
        cq.display(); // 2 3 4 5 6
        System.out.println(cq.size); // 5
        System.out.println(cq.isEmpty()); // false

        // cq.add(7); // Exception
        // cq.display(); // Exception: Queue is full!

        for(int i=0; i<cq.arr.length; i++){
            System.out.print(cq.arr[i]+" ");
        }
    }
}
