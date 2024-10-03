import java.util.Scanner;

public class Array_Creation {

    public static void main(String[] args) {
        int number[] = new int[8];
        Scanner sc = new Scanner(System.in);
        number[0] = sc.nextInt();
        number[1] = sc.nextInt();
        number[2] = sc.nextInt();

        System.out.println("Physics :" + number[0]);
        System.out.println("Chemistry :" + number[1]);
        System.out.println("Science : " + number[2]);

        int percentage =( number[0]+number[1]+number[2])/3;
        System.out.println("Three Subject Total Percentage = " + percentage + "%");
        System.out.println("Marks of Array length: "+ number.length);
    }
}