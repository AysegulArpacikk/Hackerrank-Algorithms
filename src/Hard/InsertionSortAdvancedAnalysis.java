package Hard;

import java.util.Arrays;
import java.util.List;

public class InsertionSortAdvancedAnalysis {

    public static int insertionSort(List<Integer> arr) {
        int[] array = new int[arr.size()];

        for(int i=0; i< arr.size(); i++) {
            array[i] = arr.get(i);
        }

        for (int i=1; i<array.length; ++i) {
            int temp = array[i];
            int j = i - 1;

            if (j < temp && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j+1] = temp;

        }
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        return 1;
    }

    public static void main(String[] args) {
        insertionSort(Arrays.asList(2, 1, 3, 1, 2));
    }
}
