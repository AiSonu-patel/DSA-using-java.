public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={7,8,3,1,2};
        //time complexity: O(n^2)

        for(int i = 0; i <arr.length; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println("Sort element");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
