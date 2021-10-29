package Easy;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result14 {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        n = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    n++;
                }
            }
        }
        System.out.println(n);
        return n;
    }

}

class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {

        int n = 6;

        int k = 3;

        List<Integer> ar = Arrays.asList(1, 3, 2, 6, 1, 2);

        Result14.divisibleSumPairs(n, k, ar);
    }
}
