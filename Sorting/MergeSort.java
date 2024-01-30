public class MergeSort {
    //time complexity: O(nlogn)
    public static void printArray(int[] arr) {
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void MergeArr(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for(i = 0; i < n1; i++) left[i] = arr[l+i];
        for(j = 0; j < n2; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if(left[i] < right[j]) 
                arr[k++] = left[i++];
            else 
                arr[k++] = right[j++];
        }
        while(i < n1) 
            arr[k++] = left[i++];
        while(j < n2)
            arr[k++] = right[j++];
    }
    public static void divideArr(int[] arr, int l, int r) {
        if(l >= r) return;
        int mid = l + (r - l)/2;
        divideArr(arr, l, mid);
        divideArr(arr, mid+1, r);
        MergeArr(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        System.out.println("Array before sorting");
        printArray(arr); // 6 3 9 5 2 8
        divideArr(arr, 0, n-1);
        System.out.println("Array after sorting");
        printArray(arr); // 2 3 5 6 8 9
    }
}
