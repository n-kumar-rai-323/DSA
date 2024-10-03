import java.util.ArrayList;

public class Operations_on_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Get Operation
        int element = list.get(2);
        System.out.println(element);

        //Delete 
        list.remove(1);
        System.out.println(list);

        //set
        list.set(1, 10);
        System.out.println(list);
        
        // Contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
