public class Palindrome {
    /*
     * Given a string s, return the number of palindromic substring in it.
     * 
     * Input: s = "abc" --> a ab abc b bc c 
     * Output: 3 --> (a b c)
     */
    
    public static void main(String[] args) {
        String str = "nanan";
        // 1st problem

        // StringBuilder gtr = new StringBuilder(str);
        // gtr.reverse();
        // String s = gtr+"";
        // if(str.equals(s)){
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not palindrome");
        // }

        //2st problem

        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag == true) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
