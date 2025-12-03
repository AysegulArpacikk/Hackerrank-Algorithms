package Book;

import java.util.Scanner;

public class MatrixShow {

    public static void main(String[] args) {

        //matrix1();
        //matrix2();
        //matrix3();
        //matrix4();
        //transpose();
        matrixSign();

    }

    private static void matrix1() {
        int A[][] = new int [3][4];

        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                A[i][j] = (i * 4) + (j + 1);
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

//        Çıktı:
//        1  2	 3	 4
//        5	 6	 7	 8
//        9	 10	 11	 12
    }

    private static void matrix2() {
        int A[][] = new int [3][5];

        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                A[i][j] = j;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

//        Çıktı:
//        0	1	2	3	4
//        0	1	2	3	4
//        0	1	2	3	4
    }

    private static void matrix3() {
        int A[][] = new int [5][5];

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                A[i][j] = i == j ? 1 : 0;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        /*Çıktı:
        1	0	0	0	0
        0	1	0	0	0
        0	0	1	0	0
        0	0	0	1	0
        0	0	0	0	1*/
    }

    private static void matrix4() {
        int A[][] = new int [5][5];

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if (i == j) {
                    A[i][j] = 0;
                } else if (i > j) {
                    A[i][j] = -1;
                } else {
                    A[i][j] = 1;
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        /*Çıktı:
        0	1	1	1	1
        -1	0	1	1	1
        -1	-1	0	1	1
        -1	-1	-1	0	1
        -1	-1	-1	-1	0*/
    }

    private static void transpose() {
        int A[][] = {{1,2,3}, {4,5,6}};
        int B[][] = new int [3][2];

        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                B[j][i] = A[i][j];
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        /*Çıktı:
        1	4
        2	5
        3	6*/
    }

    private static void matrixSign() {
        Scanner input = new Scanner(System.in);
        System.out.println("Matris boyutu girin: ");
        int boyut;
        boyut = input.nextInt();
        int A[][] = new int[boyut][boyut];
        int sum = 0;

        for(int i=0; i<boyut; i++) {
            for(int j=0; j<boyut; j++) {
                A[i][j] = 1 + (int)(Math.random() * 100);
                if (i == j) {
                    sum += A[i][j];
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrisin izi = " + sum);

    }
}
