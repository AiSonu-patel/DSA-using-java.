public class printSubsequences {
    //Print all the subesquences of a string = "abc" (v.v.i)
    //output: abc ab ac a bc b c
    //Time Complexity: O(2^n)

    public static void subesquences(String str, int idx, String newString) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subesquences(str, idx+1, newString + currChar);
        //or not to be
        subesquences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subesquences(str, 0, "");
    }
}
