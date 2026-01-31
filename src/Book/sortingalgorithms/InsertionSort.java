package Book.sortingalgorithms;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutu girin: ");
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = 1 + (int)(Math.random() * 100);
        }

        for (int i=1; i<n; i++) {
            int number = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > number) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = number;
        }

        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
