
class sumElement{
    void sumArray(){
        // calculate the sum of all the element in the given array.
        int[] arr = {10,20,30};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
public class SumOfArrEleme {
    public static void main(String[] args) {
        sumElement obj = new sumElement();
        obj.sumArray();
    }
}
