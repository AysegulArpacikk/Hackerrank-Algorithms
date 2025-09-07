package Easy;

import java.util.*;

class CircularArrayRotation {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        LinkedList<Integer> linkedList = new LinkedList<>(a);
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<k; i++) {
            int lastElement = linkedList.getLast();
            linkedList.removeLast();
            linkedList.addFirst(lastElement);
        }

        for (Integer query : queries) {
            result.add(linkedList.get(query));
        }

        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        List<Integer> queries = new ArrayList<>();
        queries.add(0);
        queries.add(1);
        queries.add(2);
        circularArrayRotation(array, 2, queries);
    }
}


