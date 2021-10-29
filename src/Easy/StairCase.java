package Easy;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result5 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for(int i=n;i>=1;i--) {
            for(int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

}

class StairCase {
    public static void main(String[] args) throws IOException {

        Result5.staircase(6);

    }
}
