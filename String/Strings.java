import java.util.Scanner;

public class Strings{
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
       
    }
    public static void main(String[] args) {
        char arr[] ={'a','b', 'c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        Scanner sc = new Scanner(System.in);
        String name ;
        name = sc.nextLine();
        System.out.println(name);

        String fullname = "Nishan";
        System.out.println(fullname.length());

//concatenation 

String Fname = "Nishan";
String Lname = "Rai";
String FLName =Fname + " " + Lname; 
System.out.println(FLName);

// Character at index (charAt)

System.out.println(FLName.charAt(2));

printLetters(FLName);


    }
}