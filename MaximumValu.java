class ArrayExample{
    void maxValu(){
        int[] arr = {1,4,8,10,8,9};
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(ans < arr[i]){
                ans = arr[i];
            }
        }
        System.out.println("Max: "+ ans);
    }
}
public class MaximumValu {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.maxValu();

    }
}
