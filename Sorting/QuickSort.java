
public class QuickSort {
    //time complexity: O(nlogn);
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr, int st, int end) {
        int pivt = arr[st];
        int count = 0;
        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pivt){
                count++;
            }
        }
        int pivtIdx = st + count;
        swap(arr, st, pivtIdx);

        int i = st, j = end;
        while(i < pivtIdx && j > pivtIdx){
            while(arr[i] <= pivt){
                i++;
            }

            while(arr[j] > pivt){
                j--;
            }
            
            if(i < pivtIdx && j > pivtIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivtIdx;
    }

    public static void Sorting(int[] arr, int st, int end) {
        if(st >= end){
            return;
        }
        int pi = partition(arr, st, end);
        Sorting(arr, st, pi-1);
        Sorting(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {6,9,5,4,8};
        int n = arr.length;
        System.out.println("Array befor");
        printArr(arr);
        Sorting(arr, 0, n-1);
        System.out.println("Array after sorting");
        printArr(arr);
    }
}