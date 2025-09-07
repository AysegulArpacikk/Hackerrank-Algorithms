package Easy;

import java.util.Arrays;
import java.util.List;

public class FindDifferenceArray {

    public static int findDifferenceArray(List<Integer> arr) {

        int sum = 0;

        for (int i=0; i<arr.size() - 1; i++) {
            int diff = arr.get(i) - arr.get(i+1);
            sum += Math.abs(diff);
        }

        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        findDifferenceArray(Arrays.asList(10, 6, 8, 2));
    }
}
