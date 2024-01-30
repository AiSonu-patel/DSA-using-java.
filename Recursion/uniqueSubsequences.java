import java.util.HashSet;

public class uniqueSubsequences {
    //Print all the unique subsequences of a string = "aaa"
    //output: aaa aa a
    //time complexity:O(2^n)
    public static void uniSubseq(String str, int idx, String newString, HashSet<String> set) {
        if(idx == str.length()){
           if(set.contains(newString)){
            return;
           } else {
            System.out.println(newString);
            set.add(newString);
            return;
           }
        }
        char currChar = str.charAt(idx);
        //to be
        uniSubseq(str, idx+1, newString + currChar, set);
        //or not to be
        uniSubseq(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniSubseq(str, 0, "" , set);
    }
}
