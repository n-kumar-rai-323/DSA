import java.util.*;

public class LeetCode_two_sum {
    public static int[] towSumHashing(int number[], int target) {
        // Create a HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            int complement = target - number[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };

                
            }
            map.put(number[i], i);

            
            
        }
       return null;
        

    }

    public static void main(String[] args) {
        int number[] = { 2, 7,11,15 };
        int targe = 9;
        System.out.println(towSumHashing(number, targe));


    }
}
