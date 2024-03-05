public class GreaterNextElement{
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = -1;
            for(int j=i+1; j<arr.length; i++){
                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
