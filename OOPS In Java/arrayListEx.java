import java.util.*;
public class arrayListEx {
    public static class Arraylist{
        int[] array = new int[2];
        int idx = 0;
        int size = 0;
        public void add(int ele){
            if(size == array.length){
                int[] brr = Arrays.copyOf(array, array.length*2);
                // array = new int[brr.length];
                // array = Arrays.copyOf(brr, brr.length);
                //or
                array = brr;
            }
            array[idx] = ele;
            idx++;
            size++;
            
        }
        public void set(int idx, int val){
            array[idx] = val;
        }
    }
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(4);
        // arr.add(5);
        // arr.add(9);
        // arr.add(8);
        // arr.add(2);
        // arr.add(1);
        // arr.set(1, 20);
        // System.out.println(arr.size());
        // System.out.println(arr);

        Arraylist array = new Arraylist();
        array.add(2);
        array.add(5);
        array.add(8);
        array.set(0,10);
        System.out.println(array.size);
        System.out.println(array);
    }
}
