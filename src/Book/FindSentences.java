package Book;

import java.util.Scanner;

public class FindSentences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin girin: ");
        String metin = input.nextLine();
        String[] cumle = metin.split("\\.");

        for(int i=0; i<cumle.length; i++) {
            System.out.println(i + 1 + ". Cümle: " + cumle[i]);
        }

        System.out.println("Cümle sayısı = " + cumle.length);
    }
}
