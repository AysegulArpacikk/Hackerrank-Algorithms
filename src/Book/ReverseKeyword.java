package Book;

import java.util.Scanner;

public class ReverseKeyword {

    public static void main(String[] args) {
        System.out.println("Bir isim gir: ");
        Scanner input = new Scanner(System.in);
        String isim = input.nextLine();
        char[] chatArr = isim.toCharArray();

        for (int i = chatArr.length - 1; i >= 0; i--) {
            System.out.print(chatArr[i]);
        }
    }
}
