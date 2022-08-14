package AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedSquaredArray {

    public static List<Integer> sortedArray(List<Integer> list) {
        List<Integer> resultArr = new ArrayList<>();

        for(int i=0; i<list.size(); i++) {
            resultArr.add(list.get(i) * list.get(i));
        }

        System.out.println(resultArr);
        return resultArr;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,-2,3,4,5,6,7,8,9));
        sortedArray(list);
    }
}
