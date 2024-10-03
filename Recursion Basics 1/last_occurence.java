public class last_occurence {
    public static int lastOccr(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int ifFound = lastOccr(arr, key, i+1);
        if(ifFound != -1){
            return ifFound;
        }

        if(arr[i] == key){
            return i;
        }
        return ifFound;
    }
    public static void main(String[] args) {
        int arr[]={0,2,3,4,5,6,4,3,2,4,5};
        int key = 5;
        System.out.println(lastOccr(arr, key,0));
    }
}
