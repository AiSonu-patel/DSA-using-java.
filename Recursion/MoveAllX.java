public class MoveAllX {
    //Move all 'x' to the end of the string = "axbcxxd"
    //time complexity: O(n)
    public static char currChar;
    public static void  moveXelement(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveXelement(str, idx+1, count, newString);
        } else {
            newString += currChar;
            moveXelement(str, idx+1, count, newString);
        }

    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveXelement(str, 0, 0, "");
    }
}
