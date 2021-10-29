package Easy;

import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.toList;

class Result6 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long min = 0L;
        long max = 0L;
        long sum = 0L;
        long totalSum = 0L;

        List<Integer> sortedArr = arr.stream().sorted().collect(toList());

        for (Integer integer : sortedArr) {
            totalSum += integer;
        }

        System.out.println(totalSum);

        for(int i=0; i<sortedArr.size(); i++) {
            sum = totalSum;
            sum -= sortedArr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < max || i != 0 && sortedArr.get(i).equals(sortedArr.get(i-1))) {
                min = sum;
            }
        }

        List<Long> minMaxSum = Arrays.asList(min, max);
        System.out.println(min + " " + max);

    }

}

class MiniMaxSum {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(539674108, 549382170, 270968351, 746219035, 140597628);

        Result6.miniMaxSum(arr);
    }
}
