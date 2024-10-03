public class power_n {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        int x = 5;
        int n =4;
        System.out.println(power(x, n));
    }
}
