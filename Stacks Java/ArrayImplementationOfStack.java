public class ArrayImplementationOfStack {
    public static class Stack{
        private int[] arr = new int[50];
        private int idx = 0;

        void push(int val){
            arr[idx] = val;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            } else {
                return false;
            }
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            } else {
                return false;
            }
        }
        int size(){
            return idx;
        }
        int capacity(){
            return arr.length;
        }
        void display(){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());

    }
    
}