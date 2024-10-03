import java.util.*;
public class Question_1 {
    public static void main(String[] args) {
        //count how many times lowercase vowels occurred in a string entered by the user.
        String str = new Scanner(System.in).nextLine();
        int count = 0;
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch =='u'){
                count++;
            }
        }
        System.out.println("Count of vowels is : "+ count);
    }
}
