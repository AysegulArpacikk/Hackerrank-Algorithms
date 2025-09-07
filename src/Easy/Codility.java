package Easy;

import java.util.ArrayList;
import java.util.List;

public class Codility {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int sum = 0;
        int result = 1;

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(first);
        fibonacciList.add(second);

        for (int i=1; i<6; i++) {
            sum = fibonacciList.get(i) + fibonacciList.get(i-1);
            fibonacciList.add(sum);
            result += fibonacciList.get(i);
        }

        result = result + fibonacciList.get(fibonacciList.size()-1);
        System.out.println(fibonacciList);
        System.out.println(result);
    }
}
