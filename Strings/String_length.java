public class String_length {
public static void findStringLength(String str){
    // System.out.println(str.length());

    //String charAt Method
    for(int i=0; i<=str.length(); i++){
        System.out.print(str.charAt(i)+ "");
    }
}
    public static void main(String[] args) {
        String str = "Nishan kumar Rai";
        findStringLength(str);
    }
}