
// write a java program to check if a number is a palindrome in java ? (121 is a palindrome, 321 is not )

import java.util.Scanner;

public class Question3 {
    public static boolean palindrome(int n) {
        int palindromeNum = n;
        int reverse = 0;
        while (palindromeNum != 0) {

            
            int remainder = palindromeNum % 10;
            reverse = reverse * 10 + remainder;
            palindromeNum = palindromeNum / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(palindrome(n)){
            System.out.println("Number : " + n + " is a palindrome");
        }else{
            System.out.println("Number : " + n+ " is not a palindrome");
        }
        

    }
}
