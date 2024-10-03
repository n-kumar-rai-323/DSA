import java.util.*;
public class Pair_sum_ad {
    public static boolean pariSum(ArrayList <Integer> list, int target){
        int n = list.size();
        int breakingPoint= -1;
        for(int i = 1; i<=list.size(); i++){ //Breaking Point
            if(list.get(i) > list.get(i+1)){
                breakingPoint = i;
                break;
            }
        }
        int leftPoint = breakingPoint+1;  //smallest 
        int rightPoint = breakingPoint; // largest

        while (leftPoint != rightPoint) {
            //case1
            if(list.get(leftPoint) + list.get(rightPoint) == target){
                return true;
            }

            // case2
            if(list.get(leftPoint) + list.get(rightPoint) < target){
                leftPoint = (leftPoint +1) %n;
            }else{
                rightPoint = (n+rightPoint-1) %n;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 20;
        System.out.println(pariSum(list, target));
    }
}
