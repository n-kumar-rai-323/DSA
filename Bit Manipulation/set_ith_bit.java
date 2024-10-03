public class set_ith_bit {
    public static int setItBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setItBit(10,2));
    }
}
