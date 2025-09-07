package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindDigits {

    public static int findDigits(int n) {
        int count = 0;
        String str = String.valueOf(n);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(Integer.valueOf(String.valueOf(str.charAt(i))));
        }

        for (int i=0; i<list.size(); i++) {
            if (list.get(i) == 0) {
                continue;
            }
            if (n % list.get(i) == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        findDigits(1012);
    }
}
