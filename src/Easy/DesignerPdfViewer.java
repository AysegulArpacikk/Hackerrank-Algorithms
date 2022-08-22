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

class Result23 {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {

        Map<Character, Integer> alphabet = new HashMap<>();

        int i = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.put(c, h.get(i));
            i++;
        }

        char[] ch = word.toCharArray();
        int max = 0;

        for (int j = 0; j < ch.length; j++) {
            if (alphabet.containsKey(ch[j])) {
                if (alphabet.get(ch[j]) > max) {
                    max = alphabet.get(ch[j]);
                }
            }
        }

        return max * word.length();
    }

}

public class DesignerPdfViewer {
    public static void main(String[] args) throws IOException {
        List<Integer> h = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);

        Result23.designerPdfViewer(h, "abc");
    }
}

