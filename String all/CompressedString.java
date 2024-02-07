public class CompressedString {
    /*
     * The string should be compressed such that consecutive duplicates of characters are replaced with the character
     * and followed by the number of consecutive duplicates.
     * 
     * Inpute:aaabbbbccddde
     * Output:a3b4c2d3e 
     */
    public static void main(String[] args) {
        String str = "aaabbbbccddde";
        String ans = "" + str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            } else {
                if(count > 1) ans += count;
                count = 1;
                ans += curr;
            }
        }
        if(count > 1) ans += count;
        System.out.println(ans);
    }
}
