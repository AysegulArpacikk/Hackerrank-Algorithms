package Book;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string ifade girin: ");
        String name = input.next();
        char[] arr = name.toCharArray();
        Arrays.sort(arr);
        System.out.print(arr);
    }
}
