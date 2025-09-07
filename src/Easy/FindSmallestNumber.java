package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class FindSmallestNumber {

    public static int findSmallestNumber(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int[] nums2 = Arrays.stream(nums).sorted().toArray();
        int count = 0;
        int temp = 0;
        while (count+1 < nums2.length) {
            if (nums2[count] == nums2[count+1]) {
                temp = nums2[count];
                break;
            }
            count++;
        }

        System.out.println(temp);

        return temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{ 5,1,4,4,2,2,3,6,3 };
        findSmallestNumber(nums);
    }
}
