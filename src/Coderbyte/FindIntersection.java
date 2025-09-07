package Coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindIntersection {
    public static String FindIntersection(String[] strArr) {

        List<String> result = new ArrayList<>();
        List<String> list1 = Arrays.asList(strArr[0].split(","));
        List<String> list2 = Arrays.asList(strArr[1].split(","));

        for (int i=0; i<list1.size(); i++) {
            for (int j=0; j<list2.size(); j++) {
                if (Objects.equals(list1.get(i), list2.get(j))) {
                    result.add(list2.get(j));
                }
            }
        }
        return result.toString();
    }

    public static void main (String[] args) {
        String [] array = new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
        System.out.print(FindIntersection(array));
    }
}
