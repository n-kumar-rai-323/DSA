public class reverse_number {

    public static void main(String[] args) {
        int n= 1998;
        while(n>0){
            // if you want last number you can used modul % give number 10  
            // if you want remove last number you can used divide / given number 10 
           int  lastDigit = n%10;
           System.out.println(lastDigit + " ");
           n = n/10;

        }
        System.out.println();
    }
}