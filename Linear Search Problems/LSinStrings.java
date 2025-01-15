import java.util.*;
public class LSinStrings {
    public static void main(String[] args) {
        String str = "Ashay";
        char target='e';
        // System.out.println(Search(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean Search(String str, char target) {
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }    
        return false;    
    }
    // "ashay" : this is string
    // ['a','s','h','a','y'] - this is character Array or charArray;
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}