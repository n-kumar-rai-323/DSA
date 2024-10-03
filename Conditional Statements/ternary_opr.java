public class ternary_opr {
    public static void main(String[] args) {
        // variable = condition?statement1:statement2;
       int number = 4;
       String type = ((number%2) ==0) ? "even" : "odd";
       System.out.println(type);
    }
}
