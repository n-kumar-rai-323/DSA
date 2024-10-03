import java.util.Scanner;

public class parameters_vs_arguments {
   public static int calCulateSum(int a, int b){ //parameters or formal parameters 
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
        System.out.println("sum is : " + sum );// arguments or actual parameters

    }
}
