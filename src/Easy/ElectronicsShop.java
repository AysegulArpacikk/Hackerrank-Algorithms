package Easy;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<keyboards.length; i++) {
            for (int j=0; j<drives.length; j++) {
                list.add(keyboards[i] + drives[j]);
            }
        }

        list.removeIf(num -> num > b);

        if (list.isEmpty()) {
            return -1;
        }

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        return sortedList.get(sortedList.size() - 1);
    }

    public static void main(String[] args) throws IOException {
        int[] keyboards = new int[]{ 4 };
        int[] drives = new int[]{ 5 };
        getMoneySpent(keyboards, drives, 5);
    }
}

