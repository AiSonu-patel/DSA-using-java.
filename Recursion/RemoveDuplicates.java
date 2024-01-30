
public class RemoveDuplicates {
    //Remove duplicates in a string = 'abbccda'
    //tome complexity: O(n)

    public static boolean[] map = new boolean[26];
    public static char CurrChar;
    public static void remove(String str, int idx, String newString) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        CurrChar = str.charAt(idx);
        if(map[CurrChar - 'a'] == true){
            remove(str, idx+1, newString);
        } else {
            newString += CurrChar;
            map[CurrChar - 'a'] = true;
            remove(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccd";
        remove(str, 0, "");
    }
}
