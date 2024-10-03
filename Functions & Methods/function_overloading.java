public class function_overloading {
    public static int sum (int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c; 
    }
    public static void main(String[] args) {
        int a =5;
        int b=6;
        int c=5;
        System.out.println(sum(0, 0));
        System.out.println(sum(a, b, c));
        
    }
}
