import java.util.*;;
public class largest_in_array {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
       for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
       }
       return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 5, 7, 8, 33, 5, 6, 1 };
        System.out.println(getLargest(numbers));

    }
}
