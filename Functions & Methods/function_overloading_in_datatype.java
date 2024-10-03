public class function_overloading_in_datatype {
    public static int sum (int a, int b){
        return a + b;
    }

    public static float sum (float a, float b, float c){
        return a + b + c;
    }
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, b));
    }
}
