/**
 * Permutations
 */
public class Permutations {
    //Permutations in string = "ABC"
    //Time Complexity: O(n*n!)
    public static void BackTracking(String str, String perm, int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            BackTracking(newStr, perm + currChar, idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        BackTracking(str, "", 0);
    }
}