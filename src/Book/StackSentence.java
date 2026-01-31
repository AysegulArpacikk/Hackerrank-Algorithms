package Book;

import java.util.Scanner;
import java.util.Stack;

public class StackSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = input.nextLine();
        Stack stack = new Stack();
        char[] chArray = text.toCharArray();

        for(int i=0; i<chArray.length; i++) {
            stack.push(chArray[i]);
        }

        stack.pop();
        System.out.println("Stack elements: ");
        for (int i=0; i<stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
        System.out.println("The top element of stack: " + stack.peek());
    }
}
