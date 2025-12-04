package Book;

public class CopyCharsToString {

    public static void main(String[] args) {
        char[] str = {'a', 'b', 'c', '2', '0', '2', '5'};
        String year = String.copyValueOf(str, 3, 4);
        System.out.println("Year = " + year);

        String word = String.copyValueOf(str);
        System.out.println("Word = " + word);

        String word2 = new String(str);
        System.out.println("Word = " + word2);
    }
}
