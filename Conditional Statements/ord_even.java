import java.util.Scanner;

public class ord_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("The number is even  " + " " + num);
        } else {
            System.out.println("The number is odd" + " " + num);
        }
    }
}
