package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {

        List<Integer> list = new ArrayList<>();
        int reversed = 0;
        int flag;

        for (int a=i; a<=j; a++) {
            int n = a;
            while (n > 0) {
                flag = n % 10;
                reversed = (reversed * 10) + flag;
                n = n / 10;
            }

            if (Math.abs(a-reversed) % k == 0) {
                list.add(a);
            }
            reversed = 0;
        }

        System.out.println(list);

        return list.size();
    }

    public static void main(String[] args) {
        beautifulDays(20, 23, 6);
    }

}
