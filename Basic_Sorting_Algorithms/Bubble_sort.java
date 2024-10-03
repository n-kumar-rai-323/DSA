public class Bubble_sort{
    public static void bubbleASort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // large elements come to the end of array by swaping with adjacent elements .
        int arr[]={4,6,2,3,8,9};
        bubbleASort(arr);
        printArr(arr);
    }
}