public class print_subarrays {
    public static void subArray(int numb []){
        int total = 0;
        for(int i =0; i<numb.length; i++){
            int start = i;
            for(int j=i; j<numb.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numb[k] + " ");
                    
                }
                System.out.println();
            }
            // total++;
            // System.out.println("total sub array " + total);
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int numb[]= {2,3,4,5};
        subArray(numb);
    }
}
