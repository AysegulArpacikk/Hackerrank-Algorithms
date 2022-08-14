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

class Result17 {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {

        int pairSocks = 0;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(ar.get(i).equals(ar.get(j)) && ar.get(i)>0 && ar.get(j)>0) {
                    pairSocks++;
                    ar.set(j , -1);
                    j = i+1;
                    i = i+1;
                }
            }
        }

        System.out.println(pairSocks);
        return pairSocks;
    }

}

public class SalesByMatch {
    public static void main(String[] args) throws IOException {

        List<Integer> ar = Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3);

        Result17.sockMerchant(10, ar);
    }
}

