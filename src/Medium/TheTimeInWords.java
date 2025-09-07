package Medium;

public class TheTimeInWords {

    public static String[] hourWords = new String[]{
            "zero", "one", "two", "three",
            "four", "five", "six","seven",
            "eight", "nine", "ten", "eleven",
            "twelve"
    };

    public static String[] minuteWords = new String[]{
            "zero", "one minute", "two minutes", "three minutes", "four minutes", "five minutes",
            "six minutes", "seven minutes", "eight minutes", "nine minutes", "ten minutes", "eleven minutes",
            "twelve minutes", "thirteen minutes", "fourteen minutes", "quarter", "sixteen minutes",
            "seventeen minutes", "eighteen minutes", "nineteen minutes", "twenty minutes", "twenty one minutes",
            "twenty two minutes", "twenty three minutes", "twenty four minutes", "twenty five minutes",
            "twenty six minutes", "twenty seven minutes", "twenty eight minutes", "twenty nine minutes", "half"
    };

    public static String timeInWords(int h, int m) {
        if (m == 0) {
            return hourWords[h] + " o' clock";
        } else if (m <= 30) {
            return minuteWords[m] + " past " + hourWords[h];
        }
        return minuteWords[60 - m] + " to " + hourWords[h + 1];
    }

    public static void main(String[] args) {
        timeInWords(5, 35);
    }
}
