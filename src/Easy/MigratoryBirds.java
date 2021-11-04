package Easy;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result15 {

    /*
     * Complete the 'Easy.migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[arr.size() + 1];
        for (int num : arr) {
            count[num]++;
        }

        int max = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[max]) {
                max = i;
            }
        }

        return max;
    }

}

class MigratoryBirds {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);

        Result15.migratoryBirds(arr);
    }
}

