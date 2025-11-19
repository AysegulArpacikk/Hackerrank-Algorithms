package Book;

import java.util.Scanner;

public class BarcodeProgramme {

    public static void main(String[] args) {
        System.out.println("Barkod numarasını girin: ");
        int n[] = new int[13];
        int tek = 0, cift = 0, sum = 0, a = 0;

        while (a == 0) {
            for (int i = 0; i < n.length; i++) {
                n[i] = 1 + (int) (Math.random() * 10);
                System.out.print(n[i] + " ");
            }

            for (int i = 0; i < n.length - 1; i++) {
                if (i % 2 == 1) {
                    tek += n[i];
                } else {
                    cift += n[i];
                }
            }

            sum = (tek * 3) + cift;
            if (sum % 10 == n[12]) {
                System.out.println(" -> Barkod doğru");
                a = 1;
            } else {
                System.out.println(" -> Barkod yanlış");
            }
        }
    }
}
