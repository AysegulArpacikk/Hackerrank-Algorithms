package Easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result22 {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {

        List<Integer> sortedList = height.stream().sorted().collect(Collectors.toList());

        if (sortedList.get(sortedList.size() - 1) > k) {
            return sortedList.get(sortedList.size() - 1) - k;
        }

        return 0;
    }

}

public class TheHurdleRace {
    public static void main(String[] args) throws IOException {
        List<Integer> height = Arrays.asList(1, 6, 3, 5, 2);

        Result22.hurdleRace(8, height);
    }
}

