package Easy;

public class FindMaxZeroNum {

    public static int findMaxZero(int number) {
        String binary = Integer.toBinaryString(number);
        char[] ch = new char[binary.length()];
        int count = 0;
        int max = 0;

        for (int i = 0; i < binary.length(); i++) {
            ch[i] = binary.charAt(i);
        }

        for(int j=0; j < ch.length; j++) {
            if(ch[j] == '0') {
                count++;
                if(count > max) {
                    max = count;
                }
            } else if(ch[j] == '1') {
                count = 0;
            }
        }

        System.out.println(max);
        return max;

    }

    public static void main(String[] args) {
        findMaxZero(200);
    }
}
