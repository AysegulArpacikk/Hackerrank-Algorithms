package Easy;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result12 {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = Arrays.asList(0, 0);
        int max = scores.get(0);
        int min = scores.get(0);
        int maxCount = 0;
        int minCount = 0;

        for(int i=1; i<scores.size(); i++) {
            if(scores.get(i) > max) {
                max = scores.get(i);
                maxCount++;
                result.set(0, maxCount);
            }
            if(scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
                result.set(1, minCount);
            }
        }

        System.out.println(result);
        return result;
    }

}

class BreakingRecords {
    public static void main(String[] args) throws IOException {

        List<Integer> scores = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);

        Result12.breakingRecords(scores);
    }
}
