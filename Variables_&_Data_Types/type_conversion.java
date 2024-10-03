import java.util.Scanner;

public class type_conversion {
    
    public static void main(String[] args) {
        // byte -> short -> int -> float -> long -> double 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextFloat(); not allowed
        float number2 = sc.nextInt(); allowed 
        System.out.println(number);
    }
}
