public class decreasing_order{
    public static void print(int n){
        //print numbers in decreasing order
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}