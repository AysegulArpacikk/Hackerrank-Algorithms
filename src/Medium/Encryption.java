package Medium;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Encryption {

    public static String encryption(String s) {
        String spaceless = s.replaceAll(" ", "");
        char[] chars = spaceless.toCharArray();

        int column = (int)sqrt(chars.length);
        int row = 0;
        if (pow(column,2) == chars.length) {
            row = column;
        } else {
            row = column + 1;
        }

        if (column*row < chars.length) {
            column++;
        }

        char[][] array = new char[column][row];
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(int i=0; i<column; i++) {
            for(int j=0; j<row; j++) {
                array[i][j] = chars[count];
                count++;
                if (count >= spaceless.length()) {
                    break;
                }
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                if (array[j][i] != '\u0000') {
                    sb.append(array[j][i]);
                }
            }
            sb.append(" ");
        }

        System.out.println("sb = " + sb);

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = encryption("oguzhan kanbek uykun mu geldi");
        System.out.println(s);
        //isieae fdtonf fotrga anoyec cttctt tfhhhs
        //idtyts fooch fnthe athaf cfena tiogc stret
    }
}
