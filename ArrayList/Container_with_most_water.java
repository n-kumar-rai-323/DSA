import java.util.*;
public class Container_with_most_water {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0; i<=height.size(); i++){
            for(int j= i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
           
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(5);
        height.add(9);
        height.add(4);
        height.add(6);
        System.out.println(storeWater(height));
    }
}
