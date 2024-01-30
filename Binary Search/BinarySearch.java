public class BinarySearch {

    public static boolean BinarySearExam(int[] arr, int target){
        // time complexity: O(logn)
        // space complexity: O(1)
        int n = arr.length;
        int st = 0, end = n-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(target == arr[mid]){
                return true;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return false;
    }

    public static boolean recBinarySearch(int[] arr, int st, int end, int target){
        // time complexity: O(logn)
        // space complexity: O(logn)
        if(st > end) return false;
        int mid = st + (end - st)/2;
        if(target == arr[mid]){
            return true;
        } else if (target < arr[mid]){
            return recBinarySearch(arr, st, mid-1, target);
        } else {
            return recBinarySearch(arr, mid+1, end, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 0;
        while (target != 10) {
            System.out.printf("%d exists in arr: %b \n", target, BinarySearExam(arr, target));
            System.out.printf("%d exists in arr: %b \n", target, recBinarySearch(arr, 0, arr.length-1, target));
            System.out.println();
            target++;
        }
        
    }
}