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

class Result18 {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;

        for (Integer index : ar) {
            sum += index;
        }

        System.out.println("Sum = " + sum);
        return sum;
    }

}

public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 10, 11);

        Result18.simpleArraySum(ar);
    }
}
