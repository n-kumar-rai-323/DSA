public class Check_if_a_String_is_Palindrome {
    public static boolean palindrome(String str){
        for(int i = 0; i<str.length()/2; i++){
           int n = str.length();
           if(str.charAt(i)!=str.charAt(n-1-i)){
            //not palindrome
            return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrome(str));
    }
}
