public class RotedDuplicateSortedArr {
    /*
     * Search element in rotated sorted array with duplicate elements. Return true if the element is found, else
     * retuen false.
     * 
     * Inpute:
     * array = {0,0,0,1,1,1,2,0,0,0}
     * target = 2
     * 
     * Output:
     * true
     */

    public static boolean searchEleme(int[] arr, int target){
        int st = 0, end = arr.length-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == target){
                return true;
            } else if(arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;
                end--;
            } else if(arr[mid] <= arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target >= arr[st] && target < arr[mid]){
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        System.out.println(searchEleme(arr, target));
    }
}
