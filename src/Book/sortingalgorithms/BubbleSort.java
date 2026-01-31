package Book.sortingalgorithms;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutunu girin: ");
        int n = input.nextInt();
        int[] A = new int[n];

        for (int i=0; i<n; i++) {
            A[i] = 1 + (int)(Math.random() * 100);
        }

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (A[j+1] < A [j]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for (int i=0; i<n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
