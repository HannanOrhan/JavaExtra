package coding.array;

import java.util.HashMap;
import java.util.Map;

public class AddUpToSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        Map<Integer,Integer> pairs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10){
                    pairs.put(arr[i],arr[j]);
                }
            }
        }

        System.out.println(pairs);

    }
}
  /*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10
            Output:
                {8=2, 7=3}
     */