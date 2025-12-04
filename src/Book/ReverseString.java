package Book;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle girin: ");
        String name = input.nextLine();
        StringBuilder stringBuilder = new StringBuilder(name);
        System.out.println("Cümlenin tersi = " + stringBuilder.reverse());
    }
}
