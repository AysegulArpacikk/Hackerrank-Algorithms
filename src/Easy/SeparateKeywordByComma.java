package Easy;

import java.util.Scanner;

public class SeparateKeywordByComma {

    public static void main(String[] args) {
        System.out.println("Bir cümle girin: ");
        Scanner input = new Scanner(System.in);
        input.useDelimiter("[\\s-]+");
        while (input.hasNext()) {
            System.out.println(input.next());
        }
    }
}
