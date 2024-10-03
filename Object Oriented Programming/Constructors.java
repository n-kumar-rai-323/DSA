public class Constructors {
    // constructor is a special method which is invoked automatically at the time of object creation.
   public static void main(String args[]){
    Student s1 = new Student();
    Student s2 = new Student("Nishan");
    Student s3 = new Student(123);

   }
}

class Student{
    String name;
    int roll;
//Non-parameterized
    Student(){
        System.out.println("Constructor");
    }
// parameterized
    Student(String name ){
        this.name = name;
    }
// parameterized
    Student(int roll){
        this.roll= roll;
    }
}
