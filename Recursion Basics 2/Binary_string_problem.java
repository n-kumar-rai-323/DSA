public class Binary_string_problem {
    public static void printBinStrings(int n, int lastPace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n-1, 0, str+"0");
        if(lastPace ==0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinStrings(3, 0,"");
    }
}
