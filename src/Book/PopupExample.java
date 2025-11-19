package Book;

import javax.swing.JOptionPane;

public class PopupExample {

    public static void main(String[] args) {
        int not = Integer.parseInt(JOptionPane.showInputDialog("Notunuzu giriniz: "));
        String harf;

        switch (not / 10) {
            case 10:
            case 9:
                harf = "AA";
                break;
            case 8:
                harf = "BA";
                break;
            case 7:
                harf = "BB";
                break;
            case 6:
                harf = "CB";
                break;
            case 5:
                harf = "CC";
                break;
            default:
                harf = "FF";
                break;
        }

        JOptionPane.showMessageDialog(null, harf, "Harf Karsiligi", JOptionPane.PLAIN_MESSAGE);
    }
}
