package Book;

public class MatrixMultiply {

    public static void main(String[] args) {
        int A[][] = new int[][]{{1,2}, {1,2}, {1,2}};
        int B[][] = new int[][]{{1,2,3}, {1,2,3}, {1,2,3}};
        int C[][] = new int[3][3];

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                for(int k=0; k<2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
