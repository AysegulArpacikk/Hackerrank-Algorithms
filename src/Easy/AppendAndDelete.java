package Easy;

import java.util.ArrayList;
import java.util.List;

public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
//        if (s.contains(t)) {
//            String news = s.replace(t, "");
//            if (k >= news.length()) {
//                System.out.println("YES");
//                return "Yes";
//            } else {
//                System.out.println("NO");
//                return "No";
//            }
//        } else {
//            StringBuilder sameString = new StringBuilder();
//            for (int i=0; i<s.length(); i++) {
//                if (t.length() != i && s.charAt(i) == t.charAt(i)) {
//                    sameString.append(s.charAt(i));
//                }
//                if (sameString.length() > 0 && s.charAt(i) != t.charAt(i)) {
//                    break;
//                }
//            }
//            System.out.println(sameString);
//            String news = s.replace(sameString, "");
//            String newt = t.replace(sameString, "");
//            int sum = news.length() + newt.length();
//            if (k >= sum) {
//                System.out.println("Yes");
//                return "Yes";
//            }
//            System.out.println("No");
//            return "No";
//        }
        if (s.contains(t)) {
            String news = s.replace(t, "");
            if (k >= news.length()) {
                System.out.println("Yes");
                return "Yes";
            } else {
                System.out.println("No");
                return "No";
            }
        } else if (t.contains(s)) {
            String newt = t.replace(s, "");
            if (k >= newt.length()) {
                System.out.println("Yes");
                return "Yes";
            } else {
                System.out.println("No");
                return "No";
            }
        } else {
            List<String> addedChars = new ArrayList<>();
            List<String> removedChars = new ArrayList<>();
            String result = null;

            while (!s.equals(t)) {
                if (s.equals("")) {
                    result = "No";
                    break;
                }
                removedChars.add(s.substring(s.length() - 1));
                s = s.substring(0, s.length() - 1);
                if (s.equals(t)) {
                    break;
                }
                addedChars.add(t.substring(t.length() - 1));
                t = t.substring(0, t.length() - 1);
            }

            if (k >= (addedChars.size() + removedChars.size())) {
                result = "Yes";
            } else {
                result = "No";
            }

            System.out.println(addedChars);
            System.out.println(removedChars);
            System.out.println(result);
            return result;
        }
    }

    public static void main(String[] args) {
        appendAndDelete("y", "yu", 2);
    }
}
