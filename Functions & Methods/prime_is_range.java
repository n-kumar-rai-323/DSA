public class prime_is_range {
    public static boolean isPrime(int n){

        if(n ==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n %2==0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i=2;i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        primeRange(100000);
        
    }
}
