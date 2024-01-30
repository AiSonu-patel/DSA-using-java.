public class TowerOfHanoi {
    public static void srcToDest(int n, String src, String helper, String dest){
        // time complexity: O(2^n)
        if(n == 1){
            System.out.println("transfer disk "+ n +" from "+src+" to "+dest);
            return;
        }
        srcToDest(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
        srcToDest(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        srcToDest(n, "S", "H", "D");
    }
}
