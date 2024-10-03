public class Factorial_of_a_number_n {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));

    }
}
