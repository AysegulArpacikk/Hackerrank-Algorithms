package Easy;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int sum = 0;
        List<Integer> arr = new ArrayList<>();

        for (int i=0; i<keyboards.length; i++) {
            for (int j=0; j<drives.length; j++) {
                sum = keyboards[i] + drives[j];
                arr.add(sum);
            }
        }

        System.out.println(arr);

        int diff = 0;
        int minDiff = b - arr.get(0);

        for (int i=0; i<arr.size(); i++) {
            diff = b - arr.get(i);
            if (minDiff > diff && diff > 0) {
                minDiff = diff;
            }
        }

        System.out.println(b - minDiff);

        if (b - minDiff > b) {
            return -1;
        }

        return b - minDiff;
    }

    public static void main(String[] args) throws IOException {
        int[] keyboards = new int[]{ 1, 2, 3 };
        int[] drives = new int[]{ 4, 5, 6, 7 };
        getMoneySpent(keyboards, drives, 9);
    }
}

