package Easy;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result7 {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        int sum = 0;

        for(int i=0; i < candles.size(); i++){
            if(candles.get(i) > max){
                sum = 1;
                max = candles.get(i);
            }else if(candles.get(i) == max){
                sum++;
            }
        }

        System.out.println(sum);
        return sum;
    }

}

class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {

        List<Integer> candles = Arrays.asList(9547948, 8558390, 9999933, 5148263, 5864559, 9999933, 8558390);

        Result7.birthdayCakeCandles(candles);

    }
}
