package Easy;

public class SaveThePrisoners {

    public static int saveThePrisoner(int n, int m, int s) {

        int result = 0;

        if (m > n) {
            int mod = m % n;
            result = mod + s - 1;
        } else {
            result = m + s -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int result = saveThePrisoner(353972922, 573651462, 244520504);
        System.out.println(result);
    }
}
