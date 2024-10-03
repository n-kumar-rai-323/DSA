import java.lang.reflect.Array;
import java.util.*;

public class Multi_dimensional_arrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer>list1= new ArrayList<>();
        // list1.add(2);
        // list1.add(5);
        // list1.add(9);

        ArrayList<Integer>list2 = new ArrayList<>();
        // list2.add(5);
        // list2.add(4);
        // list2.add(7);

        ArrayList<Integer> list3 =new ArrayList<>();
        // list3.add(1);
        // list3.add(6);
        // list3.add(3);

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        MainList.add(list1);
        MainList.add(list2);
        MainList.add(list3);
        System.out.println(MainList);

        // nested loops
        for(int i=0; i<MainList.size(); i++){
            ArrayList<Integer> currList = MainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
