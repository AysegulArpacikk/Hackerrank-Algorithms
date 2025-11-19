package Easy;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        if (s.length() == 1) {
            if (s.equals(String.valueOf('a'))) {
                return n;
            } else
                return 0L;
        } else if (s.length() > n) {
            long count = 0L;
            char[] chars1 = s.toCharArray();
            for (int i=0; i<n; i++) {
                if (chars1[i] == 'a') {
                    count++;
                }
            }
            System.out.println(count);
            return count;
        }

        long mod = n % s.length();
        long divide = n / s.length();
        char[] chars = s.toCharArray();
        long count = 0L;
        long modCount = 0L;

        for (int i=0; i<mod; i++) {
            if (chars[i] == 'a') {
                modCount++;
            }
        }

        for (int i=0; i<chars.length; i++) {
            if (chars[i] == 'a') {
                count++;
            }
        }

        if (s.length() < n) {
            count = (count * divide) + modCount;
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        repeatedString("aba", 10L);
    }
}
