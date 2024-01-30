public class Find1stAndLansElemeInStr {
    //Find the 1st last occurance of an element in string
    //"abaacdaefaahs"
    //time Complexity: O(n)
    public static int first = -1;
    public static int last = -1;
    // public static char element;
    public static void findElement(String str, int idx, char element) {
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curEle = str.charAt(idx);
        if(curEle == element){
            if(first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }
        findElement(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdeafaahs";
        findElement(str, 0, 'a');
        
    }
}
