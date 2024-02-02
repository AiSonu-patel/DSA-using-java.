public class SearchMatrix {
    /*
     * you are given an m * n integer matrix with the following tow properties
     * 1 Each row is sorted  in non-decreasing order.
     * 2 The first integer of each row is greater then the last integer of the previous row.
     * Given an integer target return true if target is in matrix or false otherwise.
     * You must write a solution in O(log(m*n)) time complexity.
     */

    public static boolean SearchMatrixEle(int[][] arr, int target){
        //row is n , column is m;
        int n = arr.length;
        int m = arr[0].length;
        int st = 0, end = n*m-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            int midEle = arr[mid/m][mid%m];
            if(midEle == target) return true;
            if(target < midEle){
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }

    public static boolean search2(int[][] arr, int target){
        int n = arr.length, m = arr[0].length;
        int st = 0, end = m-1;
        while(st < n && end >= 0){
            if(arr[st][end] == target) return true;
            if(target < arr[st][end]){
                end--;
            } else {
                st++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}};
        int target = 16;
        System.out.println(SearchMatrixEle(arr, target));
        System.out.println(search2(arr, target));
    }
}
