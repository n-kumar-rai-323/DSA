import java.util.Scanner;

public class large_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        if((a >=b) && (a>=c)){
            System.out.println("Largest is A");
        }
        else if(b >= c){
            System.out.println("largest is B");
        } 
        else {
            System.out.println("larges is C");
        }

    }
    
}
