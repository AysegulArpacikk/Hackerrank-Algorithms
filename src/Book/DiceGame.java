package Book;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, fark = 0, count = 0;
        char s = 'd';
        System.out.println("İlk oyuncunun para miktarı: ");
        a = input.nextInt();
        System.out.println("İkinci oyuncunun para miktarı: ");
        b = input.nextInt();

        while (a != 0 && b != 0 && s == 'd') {
            count++;
            int aZar = (1 + (int) (Math.random() * 6));
            int bZar = (1 + (int) (Math.random() * 6));
            fark = aZar - bZar;
            System.out.println(count + ". turdasınız...");
            System.out.println("Birinci oyuncunun attığı zar: " + aZar);
            System.out.println("İkinci oyuncunun attığı zar: " + bZar);
            System.out.println("Zarlar arasındaki fark: " + Math.abs(fark));

            if (aZar == bZar) {
                System.out.println("Zarlar aynı geldi tekrar atılıyor...");
                continue;
            }

            if (fark > 0) {
                a += fark;
                b -= fark;
                System.out.println("İkinci oyuncunun kalan parası: " + b);
                System.out.println("Birinci oyuncunun mevcut parası: " + a);
            } else {
                fark = bZar - aZar;
                b += fark;
                a -= fark;
                System.out.println("Birinci oyuncunun kalan parası: " + a);
                System.out.println("İkinci oyuncunun mevcut parası: " + b);
            }

            if (a <= 0 || b <= 0) {
                break;
            } else {
                System.out.println("Zar atmak için d'ye basın...");
                s = input.next().charAt(0);
            }
        }

        if (a <= 0) {
            System.out.println("Oyunu " + count + ". turda ikinci(b) oyuncu kazandı!!");
        } else {
            System.out.println("Oyunu " + count + ". turda birinci(a) oyuncu kazandı!!");
        }
    }
}
