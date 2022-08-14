package Easy;

//aaabbc -> 3a2b1c
public class AmazonQuestion {

    public static String compressToString(String text) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int max = 1;
        char prevIndex;

        char[] ch = new char[text.length()];

        for(int i=0; i<text.length(); i++) {
            ch[i] = text.charAt(i);
        }

        for(int j=1; j<ch.length; j++) {
            prevIndex = ch[j-1];
            if(ch[j] == prevIndex) {
                count++;
                if(count > max) {
                    max = count;
                }
            } else {
                max = 1;
            }
            sb.append(max);
            sb.append(ch[j]);
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        compressToString("aaabbc");
    }
}
