public class FindSequentialCharacters {
    public static void main(String[] args) {
        String str = "abcdfgfklfer";

        char[] ch = new char[str.length()];

        for(int i=0; i<str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for(int i=1; i<str.length(); i++) {
            if((int)ch[i] - 1 == (int)ch[i-1]) {
                System.out.print(ch[i-1]);
            } else if(i >=2 ) {
                if((int)ch[i-1] - 1 == (int)ch[i-2]) {
                    System.out.print(ch[i-1]);
                }
            }
        }
    }
}
