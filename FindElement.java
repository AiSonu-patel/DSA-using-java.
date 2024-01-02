class findArrayElement{
    void findValu(){
        int[] arr = {5,8,9,7,2,6};
        int n = 6;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
public class FindElement {
    public static void main(String[] args) {
        findArrayElement obj = new findArrayElement();
        obj.findValu();
        
        
    }
}
