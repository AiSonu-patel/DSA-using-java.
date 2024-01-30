public class Occurrence {
    /*
       Find the first occurrence of given element x, given array is sorted. 
       If no occurrence of x is found the reture -1.

       Input:
       arr = {2,5,5,5,6,6,8,9,9,9};
       x = 5;

       Output:
       1
    */ 

    public static int FirstOccu(int[] arr, int x){
        int n = arr.length;
        int st = 0, end = n-1;
        int fo = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == x){
                fo = mid;
                end = mid - 1;
            } else if (x < arr[mid]){
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,5,5,6,6,8,9,9,9};
        int x = 5;
        System.out.print(FirstOccu(arr, x));
    }
}
