package Easy;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result15 {

    /*
     * Complete the 'Easy.migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        int count = 0;
        int number = 0;
        int number1 = 0;
        int temp = 0;

        int [] arr1 = new int[arr.size()];


        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(Objects.equals(arr.get(i), arr.get(j))) {
                    count++;
                    number = arr.get(i);
                    arr1[i] = arr.get(i);
                    System.out.println(arr.get(i));
                }
            }
        }

        System.out.println();
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr1[i]);
        }

        System.out.println();
        System.out.println(count);
        return count;
    }

}

class MigratoryBirds {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);

        Result15.migratoryBirds(arr);
    }
}

