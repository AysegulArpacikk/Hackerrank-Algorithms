package Book;

import java.util.Vector;

public class VectorNumber {

    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        int A[] = new int[numbers.capacity()];
        System.out.print("Vector = ");

        for(int i=0; i<numbers.capacity(); i++) {
            numbers.add(1 + (int)(Math.random() * 90));
            System.out.print(numbers.get(i) + " ");
            A[i] = numbers.get(i);
        }

        System.out.println();

        int min = A[0];

        for(int i=0; i<A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }

        System.out.println("En küçük sayı = " + min);

        String name = "Galatasaray";
        System.out.println(name.replace("a", "e"));
    }
}
