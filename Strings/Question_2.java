import java.util.*;;
public class Question_2 {
    //determine if 2 String are anagrams of each other 
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        //to convert lowercase 
        str1 = str1.toLowerCase();
        str2 =str2.toLowerCase();

        // to check two string length are same or not 
        if(str1.length() == str2.length()){
            char[] str1ToArray = str1.toCharArray();
            char[] str2ToArray = str2.toCharArray();

        //sort both array
            Arrays.sort(str1ToArray);
            Arrays.sort(str2ToArray);

        // to check to string same or not 
        boolean result = Arrays.equals(str1ToArray, str2ToArray);
        if(result){
            System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
        }else{
            System.out.println(str1 + " and " + str2 + " are not equal string or anagram  of each other.");
        }
    }
}
