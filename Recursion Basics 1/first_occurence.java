public class first_occurence {
    public static int firstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return-1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, key, i+1); 
    }
    public static void main(String[] args) {
        int arr[]= {0,2,3,4,5,67,4,3,5};
        int key = 5;
        System.out.println(firstOccur(arr, key,0));
    }
}
