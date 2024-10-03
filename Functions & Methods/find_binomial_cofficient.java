public class find_binomial_cofficient {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int  binCoff(int n, int r){
        int factn = factorial(n);
        int factr= factorial(r);
        int factnr= factorial(n-r);

        int binomalCoff= factn/(factr * factnr);
        return binomalCoff;
    }

    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println(binCoff(n, r));

    }
}
