public class method_voerriding {
    public static void main(String[] args) {
        deer kera = new deer();
        kera.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Nishan Rai");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Nishan kumar Rai");
    }
}