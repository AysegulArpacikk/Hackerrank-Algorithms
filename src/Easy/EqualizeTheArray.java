package Easy;

import java.util.*;
import java.util.stream.Collectors;

public class EqualizeTheArray {

    public static int equalizeArray(List<Integer> arr) {
        Integer count = 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.size(); i++) {
            if (!map.containsKey(arr.get(i))) {
                map.put(arr.get(i), count);
            } else {
                Integer mapCount = map.get(arr.get(i)) + 1;
                map.put(arr.get(i), mapCount);
            }
        }

        if (map.values().stream().noneMatch(i -> i > 1)) {
            return 0;
        }

        List<Integer> list = new ArrayList<>(map.values());

        list.remove(list.size() - 1);

        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        //equalizeArray(Arrays.asList(3, 3, 2, 1, 3));
        //equalizeArray(Arrays.asList(1, 2, 3, 1, 2, 3, 3, 3));
        equalizeArray(Arrays.asList(24, 29, 70, 43, 12, 27, 29, 24, 41, 12, 41, 43, 24, 70, 24, 100, 41, 43, 43, 100, 29, 70, 100, 43, 41, 27, 70, 70, 59, 41, 24, 24, 29, 43, 24, 27, 70, 24, 27, 70, 24, 70, 27, 24, 43, 27, 100, 41, 12, 70, 43, 70, 62, 12, 59, 29, 62, 41, 100, 43, 43, 59, 59, 70, 12, 27, 43, 43, 27, 27, 27, 24, 43, 43, 62, 43, 70, 29));
    }
}
