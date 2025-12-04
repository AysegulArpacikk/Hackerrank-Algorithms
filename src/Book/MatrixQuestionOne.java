package Book;

import java.util.Scanner;

public class MatrixQuestionOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kare matris için satır ve sütun sayısı girin: ");
        int n = input.nextInt();
        int A[][] = new int[n][n];
        int B[] = new int[n];
        int C[] = new int[n];
        int satirTop = 0, sutunTop = 0;

        System.out.println("A matrisi: ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                A[i][j] = 1 + (int)(Math.random() * 10);
                satirTop += A[i][j];
                System.out.print(A[i][j] + " ");
            }
            C[i] = satirTop;
            satirTop = 0;
            System.out.println();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sutunTop += A[j][i];
            }
            B[i] = sutunTop;
            sutunTop = 0;
        }

        System.out.println("C dizisi: ");

        for(int i=0; i<n; i++) {
            System.out.print(C[i] + " ");
        }

        System.out.println();
        System.out.println("B dizisi: ");

        for(int i=0; i<n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
