public class Print_X_to_the_power_n {
    public static int optimizedPower(int a, int n){
        if(n ==0){
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
        // n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
        public static void main(String[] args) {
        int a =2;
        int n = 10;
        System.out.println(optimizedPower(a,n));
    }
}
