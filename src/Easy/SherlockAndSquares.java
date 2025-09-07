package Easy;

public class SherlockAndSquares {

    public static int squares(int a, int b) {
        int count = 0;
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        long roundA = Math.round(sqrtA);
        long roundB = Math.round(sqrtB);

        for (long i=roundA; i <= roundB; i++) {
            if (a <= Math.pow(i, 2) && Math.pow(i, 2) <= b) {
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        squares(35, 70);
    }
}
