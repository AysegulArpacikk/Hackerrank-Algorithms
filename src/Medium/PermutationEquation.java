package Medium;

import java.util.*;

public class PermutationEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<p.size(); i++) {
            int number = i+1;
            map.put(number, p.indexOf(number) + 1);
        }

        Object[] nums = map.values().toArray();

        for (int i=0; i<nums.length; i++) {
            int index = p.indexOf(nums[i]);
            result.add(index+1);
        }

        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,5,1,2);
        permutationEquation(list);
    }
}
