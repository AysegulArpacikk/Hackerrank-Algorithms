package AlgoExpert;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TargetNumber {

    public static List<List<Integer>> twoNumberSum(Integer []arr, int target) {
        HashSet<Integer> pairSet = new HashSet<>();
        List<Integer> list;
        List<List<Integer>> resultList = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            list = new ArrayList<>();
            int pairNumber = target - arr[i]; //2

            if(pairSet.contains(pairNumber)) {
                list.addAll(Arrays.asList(arr[i], pairNumber));
                resultList.add(list);
            }

            pairSet.add(arr[i]); //2,5
        }
        System.out.println(resultList);
        return resultList;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,5,8,-1,11};
        twoNumberSum(arr, 10);
    }
}
