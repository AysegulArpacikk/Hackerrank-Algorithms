package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindPhoneNumber {

    public static void main(String[] args) {
        while (1 == 1) {
            System.out.println("Bir isim girin: ");
            Scanner input = new Scanner(System.in);
            findGsm(input);
            System.out.printf("%S", "Bade");
        }
    }

    private static void findGsm(Scanner input) {
        Map<String, String> nameGsmMap = new HashMap<>();
        nameGsmMap.put("Aysegul", "555555");
        nameGsmMap.put("Oguzhan", "222222");
        nameGsmMap.put("Emel", "333333");
        nameGsmMap.put("Kemal", "444444");
        nameGsmMap.put("Ali", "777777");
        String isim = input.nextLine();
        if (nameGsmMap.containsKey(isim)) {
            System.out.println("Telefon numarası: " + nameGsmMap.get(isim));
        } else {
            System.out.println("Telefon numarası bulunamadı !!!");
        }
    }
}
