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

class Result19 {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int count = 1;
        int location1 = 0;
        int location2 = 0;
        for (int i=0; i<=n; i+=2) {
            map.put(i, count);
            count += 2;
        }

        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());

        for (int i=0; i<=keys.size()-1; i++) {
            if (map.get(keys.get(i)).equals(p) || keys.get(i).equals(p)) {
                if (i == 0) {
                    location1 = 0;
                } else {
                    location1 = i;
                }
                System.out.println("location1 = " + location1);
            }
        }

        for(int i=keys.size()-1; i>=0;i--){
            if (map.get(keys.get(i)).equals(p) || keys.get(i).equals(p)) {
                if (i == keys.size() - 1) {
                    location2 = 0;
                } else {
                    location2 = keys.size() - 1 - i;
                }
                System.out.println("location2 = " + location2);
            }
        }

        if (location1 < location2) {
            System.out.println(location1);
            return location1;
        }
        System.out.println(location2);
        return location2;
    }

}

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        int n = 6;
        int p = 2;

        Result19.pageCount(37455,29835);
    }
}

