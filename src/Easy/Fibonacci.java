package Easy;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.print(1 + " - " + 1);
        int i = 0;
        sum(1, 1, i);
    }

    public static void sum(int a, int b, int i) {
        int sum = a + b;
        System.out.print(" - " + sum);
        a = b;
        b = sum;
        i++;
        if (i == 14) {
            return;
        }
        sum(a, b, i);
    }
}
