package Book;

public class TriangleFractal {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i+=2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        triangle();
    }

    private static void triangle() {
        for (int i=6; i>=1; i--) {
            for (int j=i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
