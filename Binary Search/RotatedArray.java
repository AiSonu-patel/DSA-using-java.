public class RotatedArray {
    /*
     * A roated array is a sorted array on which rotation operation has been performed some number of times. Given 
     * a rotated sorted array, find the index of the minimum element in the array.
     * Follow 0-based indexing.
     * 
     * It is guaranteed that all the elements in the array are unique.
     * 
     * Input:
     * array = {3,4,5,1,2}
     * Output: 3
     * 
     * time complexity: O(log N)
     */
    public static int FindMinimun(int[] arr){
        int n = arr.length;
        int st = 0, end = n-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] <= arr[n-1]){
                ans = arr[mid];
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(FindMinimun(arr));
    }
}
