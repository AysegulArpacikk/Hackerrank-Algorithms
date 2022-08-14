package AlgoExpert;

import com.apple.laf.AquaButtonBorder;

import java.util.*;

public class TargetNumber {

    public static List<Integer> twoNumberSum(Integer []arr, int target) {
        HashSet<Integer> pairSet = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Integer[] resultArr;

        for(int i=0; i<arr.length; i++) {
            int pairNumber = target - arr[i];

            if(pairSet.contains(pairNumber)) {
                resultArr = new Integer[]{arr[i], pairNumber};
                Collections.addAll(list, resultArr);
                System.out.println(list);
            }

            pairSet.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,8,5,-1,11};
        twoNumberSum(arr, 10);
    }
}
