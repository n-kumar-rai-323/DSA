import java.util.*;

public class inbuilt_sort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 5, 4 };
        Arrays.sort(arr);
        printArr(arr);

    }
}
