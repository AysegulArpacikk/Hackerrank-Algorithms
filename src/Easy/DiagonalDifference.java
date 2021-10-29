package Easy;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result3 {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(int[][] flat) {
        int minus1 = 0;
        int minus2 = 0;
        int result = 0;

        for(int i=0; i<flat.length; i++) {
            for(int j=0; j<flat.length; j++) {
                if(i == j) {
                    minus1 = minus1 + flat[i][j];
                }
            }
        }

        for(int i=0; i<flat.length; i++) {
            for(int j= flat.length-1; j>=0; j--) {
                if(j == flat.length - 1 - i) {
                    minus2 = minus2 + flat[i][j];
                }
            }
        }

        result = Math.abs(minus1 - minus2);

        System.out.println(result);

        return result;
    }

}

class DiagonalDifference {
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt("3");

        List<List<Integer>> arr = new ArrayList<>();
        int[][] flat = arr.stream()
                .map(a -> a.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        flat = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {9, 8, 9},
        };

        System.out.println(Arrays.deepToString(flat));

        Result3.diagonalDifference(flat);
    }
}
