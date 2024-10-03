import java.util.Scanner;

public class Syntax_with_parameters {
    public static int calCulateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        // returnType name(type param1, type param2){
            //body 
            // return statement 
        // }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calCulateSum(2, 5);
        System.out.println("sum is : " + sum );

    }
}
