package AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidateSubsequence {

    public static boolean isValidateSubsequence (List<Integer> list1, List<Integer> list2) {

        int seqCount = 0;

        for(int i = 0; i < list1.size(); i++) {
            if(Objects.equals(list2.get(seqCount), list1.get(i))) {
                seqCount++;
            }
        }

        if(list2.size() == seqCount) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5,1,22,25,6,-1,8,10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,6,-1,10));
        isValidateSubsequence(list1, list2);
    }
}
