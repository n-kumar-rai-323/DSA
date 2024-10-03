import java.util.*;
public class Inbuilt_sort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={9,3,4,2,6,6,3,1};
        Arrays.sort(arr);
        printArr(arr);
    }
}
