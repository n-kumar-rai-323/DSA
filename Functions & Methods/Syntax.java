public class Syntax {
    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return;
    }
    public static void main(String[] args) {
        // In Java, every method is declared with a return type such as int, float, double, string, etc. 
        // These return types required a return statement at the end of the method. A return keyword is used for returning the resulted value.
        //  The void return type doesn't require any return statement.

        // void  =In Java, the void keyword is a reserved type used mainly to specify that a method does 
        // not return any data type. It can also be used as a non-access modifier of a constructor or method, 
        // or of a class in a class declaration
        printHelloWorld();
    }
}
