package Easy;

import java.io.*;
import java.util.*;;

class Result10 {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        for(int i=0; i<apples.size(); i++) {
            apples.set(i, a + apples.get(i));
            if(apples.get(i) >= s && apples.get(i) <= t) {
                appleCount++;
            }
        }

        for(int j=0; j<oranges.size(); j++) {
            oranges.set(j, b + oranges.get(j));
            if(oranges.get(j) >= s && oranges.get(j) <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

}

class CountApplesAndOranges {
    public static void main(String[] args) throws IOException {

        List<Integer> apples = Arrays.asList(2, 3, -4);

        List<Integer> oranges = Arrays.asList(3, -2, -4);

        Result10.countApplesAndOranges(7, 10, 4, 12, apples, oranges);

    }
}
