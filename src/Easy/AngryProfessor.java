package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {

        int count = 0;

        for (int i=0; i<a.size(); i++) {
            if (a.get(i) <= 0) {
                count++;
            }
        }

        if (count >= k) {
            return "NO";
        }
        return "YES";

    }

    public static void main(String[] args) {
        String result = angryProfessor(7, new ArrayList<>(Arrays.asList(26, 94, -95, 34, 67, -97, 17, 52, 1, 86)));
        System.out.println(result);
    }
}
