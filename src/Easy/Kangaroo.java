package Easy;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result11 {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        do {
            x1 += v1;
            x2 += v2;
        } while (v1 > v2 && x1 < x2);

        if(x1 == x2) {return "YES";}
        return "NO";
    }

}

class Kangaroo {
    public static void main(String[] args) throws IOException {

        int x1 = 43;
        int v1 = 2;
        int x2 = 70;
        int v2 = 2;

        Result11.kangaroo(x1, v1, x2, v2);
    }
}
