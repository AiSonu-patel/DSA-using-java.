public class PeakIndex {
    /*
     * Given a moutain array 'a' of length greater then 3, retuen the index 'i' such that arr[0]<arr[1]<...<arr[i-1]
     * <arr[i]>arr[i+1]>...>arr[arr.length-1]. This index is known as the peak indexs.
     * 
     * Input: Arr[0,4,1,0]
     * Output: 1
     */

     public static int peakIndexInMountainArray(int[] arr) {
        int st = 0, end = arr.length;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                st = mid+1;
            } else{
                end = mid-1;
            }
        }
        return ans;
     }

    /*
     * A peak element is an element that is strictly greater then its neighbors.
     * Given a 0-indexed integer array nums, find the peak element and retuen its index. if the array contains
     * multiple peaks, retuen the index to any of the peaks
     * You may imagine that muns[-1] nums[n] = -∞. In other words, an element is always considered to be strictly
     * greater then a neighbor that is outside the array .
     * You must write an algorithm that runs in O(log n).
     * 
     * Input: arr[1,2,3,1]
     * Output: 2
     */

    public static int findPeakElement(int[] arr){
        int n = arr.length;
        int st = 0, end = n-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == n-1 || arr[mid] > arr[mid+1])){
                return mid;
            } else if(arr[mid] < arr[mid+1]){
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(findPeakElement(arr));
    }
}
