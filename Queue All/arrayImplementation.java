

public class arrayImplementation {

    public static class queueA{
        int[] arr = new int[100];
        int f = -1;
        int r = -1;
        int size = 0;
        public void add(int x){
            if(r==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(f==-1){
                f = 0;
                r = 0;
                arr[0] = x;
            }
            else {
                arr[r+1] = x;
                r++;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int v = arr[f];
            f++;
            size--;
            return v;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
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
            }
            else {
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // 1 2 3 4
        q.remove();
        q.display(); // 2 3 4
        System.out.println(q.peek()); // 2
        System.out.println(q.size); // 3
        System.out.println(q.isEmpty());

    }
}
