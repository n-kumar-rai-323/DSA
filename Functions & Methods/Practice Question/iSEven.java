import java.util.Scanner;

// Question 2. Write a method isEven that accepts an int argument. The method should return true if the argument is even
// or false otherwise. also write a program to test your method.
public class iSEven {
    public static boolean isEven(int num){
        if(num %2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
