package Medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FormingAMagicSquare {

//    public static int formingMagicSquare(List<List<Integer>> s) {
//
//        List<Integer> list = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        int sum = 0;
//
//        for (int i=0; i<3; i++) {
//            for (int j=0; j<3; j++) {
//                int number = s.get(i).get(j);
//                list.add(number);
//                if (Collections.frequency(list, number) > 1) {
//                    map.put(number, Collections.frequency(list, number) - 1);
//                }
//            }
//        }
//
//        Collections.sort(list);
//
//        for (int i=0; i< list.size()-1; i++) {
//            int changedNumber = 0;
//            if (Objects.equals(list.get(i), list.get(i + 1))) {
//                changedNumber = list.get(i + 1) + 1;
//                list.set(i+1, changedNumber);
//            }
//        }
//
//        System.out.println(list);
//        System.out.println(map);
//
//        return 1;
//    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        List<Integer> requiredNumbers = new ArrayList<>();

        for (List<Integer> integers : s) {
            for (Integer integer : integers) {
                list.add(integer);
            }
        }

        Set<Integer> duplicateList = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
        Collections.sort(list);
        List<Integer> distinctList = list.stream().distinct().collect(toList());

        for (int i=0; i<distinctList.size()-1; i++) {
            if (distinctList.get(i) + 1 != distinctList.get(i + 1)) {
                requiredNumbers.add(distinctList.get(i) + 1);
                distinctList.add(i+1, distinctList.get(i) + 1);
            }
        }

        if (distinctList.get(distinctList.size() - 1) == 8) {
            requiredNumbers.add(9);
        }

        for (int i=0; i< requiredNumbers.size()-1; i++) {
            sum += Math.abs((Integer) duplicateList.toArray()[i] - requiredNumbers.get(i));
        }


        System.out.println(list.stream().distinct().collect(toList()));
        System.out.println(duplicateList);
        System.out.println(requiredNumbers);
        System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> s = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(7);
        arr1.add(2);
        arr1.add(9);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(6);
        arr2.add(6);
        arr2.add(2);
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(5);
        arr3.add(1);
        arr3.add(2);
        s.add(arr1);
        s.add(arr2);
        s.add(arr3);
        final int i = formingMagicSquare(s);
    }
}
