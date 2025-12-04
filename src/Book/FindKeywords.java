package Book;

import java.util.Scanner;

public class FindKeywords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle girin: ");
        String sentence = input.nextLine();
        String copySentence = sentence.trim();
        int count = 1, veCount = 0;

        for(int i=0; i<copySentence.length(); i++) {
            if(copySentence.charAt(i) == ' ') {
                count++;
            }
            if(copySentence.charAt(i) == 'v' && copySentence.charAt(i + 1) == 'e') {
                veCount++;
            }
        }

        System.out.println("Kelime sayısı = " + count);
        System.out.println("VE sayısı = " + veCount);
    }
}
