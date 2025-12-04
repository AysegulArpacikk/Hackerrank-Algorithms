package Book;

import java.util.Scanner;

public class StringEncryption {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir isim girin: ");
        String name = input.next();
        char[] arr = name.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if (arr[i] < 'n') {
                System.out.print((char) (name.codePointAt(i) + 13));
            } else {
                System.out.println((char) (name.codePointAt(i) - 13));
            }
        }
    }
}
