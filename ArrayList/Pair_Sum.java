import java.util.*;
public class Pair_Sum {
    public static boolean pair(ArrayList<Integer> list, int target){
        //Brute Force 
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) ==  target){
                    return true;
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int target = 5;
        System.out.println(pair(list, target));
        
    }
}
