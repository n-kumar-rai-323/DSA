public class polymorphism {
    //Method overloading // function overloading
public static void main(String[] args) {
    Calculator plus = new Calculator();
    System.out.println(plus.sum(2,40));
    System.out.println(plus.sum((float)3.4,(float)4.0));
    System.out.println(plus.sum(39,50,50));

}
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}
