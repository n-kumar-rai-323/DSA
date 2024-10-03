public class Binary_to_decimal {
    public static void binDec(int binNum){
        int myNum =binNum;
        int pow =0;
        int decNum= 0;
        while (binNum >0) {
            int lastDigite = binNum%10;
            decNum = decNum + (lastDigite * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
            
        }
        System.out.println("Binary of " + myNum +"= " + decNum);
    }
    public static void main(String[] args) {
        binDec(101);
        
    }
}
