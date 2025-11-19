package Book;

import java.util.Scanner;

public class FindAndKeyword {

    public static void main(String[] args) {
        String mask = "(?<=.).";
        System.out.println("Bir cümle girin: ");
        Scanner input = new Scanner(System.in);
        String ve = "ve";
        while (input.hasNext()) {
            if (input.hasNext(ve)) {
                System.out.println("Aranan kelime: " + input.next(ve));
            } else {
                System.out.println("Kelime: " + input.next().replaceAll(mask, "*"));
            }
        }
    }
}
