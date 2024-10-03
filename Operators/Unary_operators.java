public class Unary_operators {
    public static void main(String[] args) {
        
        // pre increment                Post increment
        //  ++a                              a++
        //  value  change                    value use
        //  value use                        value change
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = a++;
        System.out.println(c);
        System.out.println(d);
        // pre decrement       POST decrement
        // --a                     a--
    }
}
