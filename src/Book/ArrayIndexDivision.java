package Book;

public class ArrayIndexDivision {

    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[10];
        float C[] = new float[10];

        for (int i=0; i<10; i++) {
            A[i] = 1 + (int)(Math.random() * 90);
            B[i] = 1 + (int)(Math.random() * 90);
            C[i] = (float)(B[i] / A[i]);
            if (B[i] % A[i] == 0) {
                System.out.println("Sayılar eşit olduğundan program sonlandı.");
                break;
            }
        }

        System.out.println("A dizisi : ");
        for(int i=0; i<10; i++) {
            System.out.println(A[i] + " ");
        }

        System.out.println("B dizisi : ");
        for(int i=0; i<10; i++) {
            System.out.println(B[i] + " ");
        }

        System.out.println("C dizisi : ");
        for(int i=0; i<10; i++) {
            System.out.println(C[i] + " ");
        }
    }
}
