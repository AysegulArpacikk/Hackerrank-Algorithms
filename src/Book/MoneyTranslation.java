package Book;

import java.util.Random;
import java.util.Scanner;

public class MoneyTranslation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Para miktarı girin: ");
        int para;
        para = input.nextInt();
        int A[] = {100, 50, 20, 10, 5, 1};
        int kalan;

        for (int i = 0; i < A.length; i++) {
            kalan = para % A[i];
            if (kalan == para) {
                continue;
            }
            para = para - A[i];
            System.out.println("Gerekli para: " + A[i]);
            if (para == 0) {
                break;
            } else if (A[i] == 1) {
                System.out.print("(" + para + ") adet");
            }
        }
    }
}
