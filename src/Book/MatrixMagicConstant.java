package Book;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMagicConstant {

    public static int[][] generateMagicSquare(int n) {
        if (n % 2 == 0) {
            throw new IllegalArgumentException("Bu yöntem sadece tek sayı olan n değerleri için çalışır!");
        }

        int[][] magic = new int[n][n];

        int number = 1;
        int row = 0;
        int col = n / 2;

        while (number <= n * n) {
            magic[row][col] = number;

            int nextRow = (row - 1 + n) % n;
            int nextCol = (col + 1) % n;

            // Eğer yerleşilen kare doluysa bir alt satıra in
            if (magic[nextRow][nextCol] != 0) {
                row = (row + 1) % n;
            } else {
                row = nextRow;
                col = nextCol;
            }

            number++;
        }

        return magic;
    }

    public static void printSquare(int[][] square) {
        for (int[] row : square) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // örnek olarak 5x5 sihirli kare
        int[][] magicSquare = generateMagicSquare(n);

        printSquare(magicSquare);

        int magicConstant = (int) (n * (Math.pow(n, 2) + 1) / 2);
        System.out.println("\nMagic Constant = " + magicConstant);
    }
}
