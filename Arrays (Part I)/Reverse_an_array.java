public class Reverse_an_array {
    public static void reverseArray(int number[]){
        int start =0;
        int last = number.length-1;

        while (start < last) {
            int temp = number[last];
            number[last]= number[start];
            number[start]=  temp;
            start ++;
            last --;
        }

    }
    public static void main(String[] args) {
        int number[]={2,3,4,5,6,6,7};
        reverseArray(number);
        for(int i =1; i<number.length; i++){
            System.out.print(number[i]+ " ");
        }
        System.out.println();;

    }
}
