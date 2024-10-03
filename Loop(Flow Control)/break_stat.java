public class break_stat {
    // to exit the loop 
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            if (i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println(" i am out of the loop");
    }
}
