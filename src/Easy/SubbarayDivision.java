package Easy;

import java.io.*;
import java.util.*;

class Result13 {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        for(int i=0; i<=s.size()-m; i++) {
            int sum = 0;
            for(int j=i; j<i+m; j++) {
                sum += s.get(j);
            }
            if(sum == d) {
                count++;
            }
        }

        System.out.println(count);
        return count;
    }

}

class SubarrayDivision {
    public static void main(String[] args) throws IOException {

        List<Integer> s = Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1);

        int d = 18;

        int m = 7;

        Result13.birthday(s, d, m);
    }
}
