package javaCoding;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 5, 6, 2, 0, 0, 3, 9, 4, 1, 0, 7};
        int result[] = new int[nums.length],i=0;
        for (int eachNum : nums) {
            if (eachNum!=0){
                result[i++]=eachNum;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
