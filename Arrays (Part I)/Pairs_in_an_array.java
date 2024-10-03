public class Pairs_in_an_array {

    public static void pariSum(int num[]){
        int total = 0;
        for(int i=0;i<num.length; i++){
            int curr= num[i];
            for(int j= i+1; j<num.length; j++){
                System.out.print("(" + curr  + ", " + j + ")");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total pairs " + total);
    }
    public static void main(String[] args) {
        int num []= {2,3,4,5,6,7,8};
        pariSum(num);
    }
}
