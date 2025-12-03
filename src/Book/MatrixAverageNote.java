package Book;

public class MatrixAverageNote {

    public static void main(String[] args) {
        int A[][] = new int[10][6];
        int count = 1;

        System.out.println("No" + " " + "Vize" + " " + "Quiz" + " " + "Ödev" + " "
        + "Final" + " " + "Ortalama");
        System.out.println("===\t===\t===\t===\t===\t======");

        for(int i=0; i<10; i++) {
            for(int j=0; j<6; j++) {
                if (j == 0) {
                    A[i][0] = count;
                } else if(j == 5) {
                    A[i][5] = (A[i][2]*10 + A[i][3]*10 + A[i][1]*20 + A[i][4]*60) / 100;
                } else {
                    A[i][j] = 10 + (int) (Math.random() * 90);
                }
                System.out.print(A[i][j] + "\t" + " ");
            }
            count++;
            System.out.println();
        }
    }
}
