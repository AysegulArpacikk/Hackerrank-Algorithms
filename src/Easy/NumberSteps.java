package Easy;

import java.util.Scanner;

public class NumberSteps {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, birler, onlar, yuzler, binler;
        System.out.println("Bir sayi giriniz: ");
        a = input.nextInt();

        System.out.println("Ada\\nmyo");

        binler = a / 1000;
        yuzler = (a % 1000) / 100;
        onlar = ((a % 1000) % 100) / 10;
        birler = ((a % 1000) % 100) % 10;

        System.out.println(binler + " , " + yuzler + " , " + onlar + " , " + birler);
    }
}
