package Easy;

public class HalloweenSale {

    public static int halloweenSale(int p, int d, int m, int s) {
        if (s < p) {
            return 0;
        }

        int result = 1;
        int sum = p;

        while (p >= m) {
            if (p - m < d) {
                p = m;
            } else {
                p = p - d;
            }
            sum += p;
            result++;
            if (s - m < sum) {
                if (result == 2) {
                    result--;
                }
                break;
            }
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        halloweenSale(100, 99, 81, 180);
    }
}
