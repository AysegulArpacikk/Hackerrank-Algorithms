package Easy;

import java.util.*;
import java.util.stream.Collectors;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(arr.size());

        while(arr.size() > 1) {
            Integer minNumber = arr.stream().min(Integer::compare).get();
            List<Integer> result = arr.stream()
                    .map(item -> item - minNumber)
                    .filter(item -> item > 0)
                    .collect(Collectors.toList());
            arr = new ArrayList<>();
            arr.addAll(result);
            if (result.size() != 0) {
                resultList.add(result.size());
            }
        }

        System.out.println(resultList);
        return resultList;
    }

    public static void main(String[] args) {
        cutTheSticks(Arrays.asList(8, 8, 14, 10, 3, 5, 14, 12));
    }
}
