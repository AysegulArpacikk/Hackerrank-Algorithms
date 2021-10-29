package Easy;

import java.io.*;
import java.text.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result4 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        double pRatio = 0.0;
        double nRatio = 0.0;
        double zRatio = 0.0;

        DecimalFormat numberFormat = new DecimalFormat("0.000000");

        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) > 0) {
                positive++;
            } if(arr.get(i) < 0) {
                negative++;
            } if(arr.get(i) == 0) {zero++;}
        }

        pRatio = positive / arr.size();
        nRatio = negative / arr.size();
        zRatio = zero / arr.size();

        System.out.println(numberFormat.format(pRatio));
        System.out.println(numberFormat.format(nRatio));
        System.out.println(numberFormat.format(zRatio));

    }

}

class PlusMinus {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);

        System.out.println(arr);

        Result4.plusMinus(arr);

    }
}
