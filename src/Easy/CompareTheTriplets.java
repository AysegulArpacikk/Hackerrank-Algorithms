package Easy;

import java.util.*;

class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> sum = Arrays.asList(0, 0);
        int valA = 0;
        int valB = 0;

        for(int i=0; i<sum.size(); i++) {
            System.out.println(sum.get(i));
        }

        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                valA++;
                sum.set(0, valA);
            }
            else if(a.get(i) < b.get(i)){
                valB++;
                sum.set(1, valB);
            }
        }
        return sum;
    }
}

class CompareTheTriplets {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);

        Result.compareTriplets(a, b);

    }
}
