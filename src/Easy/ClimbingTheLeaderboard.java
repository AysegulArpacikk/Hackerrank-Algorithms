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

import static java.util.stream.Collectors.*;

class Result21 {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        List<Integer> resultList = new ArrayList<>();

        List<Integer> distinctList = ranked.stream().distinct().sorted().collect(toList());

        int i = 0;
        for (Integer score : player) {
            while (i<distinctList.size() && distinctList.get(i)<=score) {
                i = i + 1;
            }
            resultList.add(distinctList.size() - i + 1);
        }

        System.out.println(resultList);

        return resultList;
    }

}

public class ClimbingTheLeaderboard {
    public static void main(String[] args) throws IOException {
        List<Integer> ranked = Arrays.asList(100, 100, 50, 40, 40, 20, 10);

        List<Integer> player = Arrays.asList(5, 25, 50, 120);

        Result21.climbingLeaderboard(ranked, player);
    }
}

