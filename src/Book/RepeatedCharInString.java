package Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedCharInString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string girin: ");
        String name = input.next();
        char[] arr = name.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        int value = 0;

        for (int i=0; i<arr.length; i++) {
            if (charMap.containsKey(arr[i])) {
                value = charMap.get(arr[i]) + 1;
                charMap.replace(arr[i], value);
            } else {
                charMap.put(arr[i], 1);
            }
        }

        System.out.println(charMap);

        for (Map.Entry<Character, Integer> mapElement : charMap.entrySet()) {
            if (mapElement.getValue() > 1) {
                System.out.println("Tekrarlı string karakteri: " + mapElement.getKey());
            }
        }
    }
}
