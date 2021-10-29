package Easy;

import java.io.*;
import java.util.*;

class Result2 {

    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream().reduce(0L, Long::sum);
    }

}

class AVeryBigSum {
    public static void main(String[] args) throws IOException {
        List<Long> ar = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L, 1000000006L);

        Result2.aVeryBigSum(ar);
    }
}
