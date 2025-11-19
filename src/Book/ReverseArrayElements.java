package Book;

public class ReverseArrayElements {

    public static void main(String[] args) {

        int A[] = {47, 29, 34, 12, 53, 98};
        int B[] = new int[6];
        int bolum, kalan;

        for(int i=0; i<A.length; i++) {
            B[i] = A[(A.length - 1) - i];
            bolum = B[i] / 10;
            kalan = B[i] % 10;
            System.out.printf("%d", kalan);
            System.out.printf("%d\t", bolum);
        }

    }
}
