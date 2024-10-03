import java.util.*;
public class Reverse_at_string_using_a_stack {
    public static String  reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx <str.length()){
            s.push(str.charAt(idx));
            idx ++;
        }
       StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr =s.pop();
            result.append(curr);
        }
        return result.toString();

    }
    public static void main(String[] args) {
        //reverse a string using a stack
         String str = "Nishan";
         String result = reverseString(str);
         System.out.println(result);
    }
}
