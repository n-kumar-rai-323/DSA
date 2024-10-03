import java.util.Scanner;

public class Question4 {
    public static int findSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        // Write a java method to compute the sum of the digits in an integer
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = findSum(n);
        System.out.println(total);
    }
}
