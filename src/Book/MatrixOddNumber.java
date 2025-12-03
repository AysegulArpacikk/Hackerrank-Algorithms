package Book;

import java.util.Scanner;

public class MatrixOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Satır sayısı girin: ");
        m = input.nextInt();
        System.out.println("Sütun sayısı girin: ");
        n = input.nextInt();
        int A[][] = new int[m][n];
        int B[] = new int[m*n];
        int count = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                A[i][j] = 1 + (int)(Math.random() * 100);
                System.out.print(A[i][j] + " ");
                if (A[i][j] % 2 == 1) {
                    B[count] = A[i][j];
                }
                count++;
            }
            System.out.println();
        }

        for (int j : B) {
            System.out.print(j + " ");
        }
    }
}
