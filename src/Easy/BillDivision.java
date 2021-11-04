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

class Result16 {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;

        for(int i=0; i<bill.size(); i++) {
            sum += bill.get(i);
        }

        sum = sum - bill.get(k);

        if((b - sum/2) > 0) {
            System.out.println(b-sum/2);
        }
        else {
            System.out.println("Bon Appetit");
        }
    }

}

public class BillDivision {
    public static void main(String[] args) throws IOException {

        List<Integer> bill = Arrays.asList(3, 10, 2, 9);

        Result16.bonAppetit(bill, 1, 12);
    }
}

