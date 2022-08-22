package Easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsAndAMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {

        int distForCatA = Math.abs(z - x);
        int distForCatB = Math.abs(z - y);

        if (distForCatA < distForCatB) {
            return "Cat A";
        }

        else if (distForCatB < distForCatA) {
            return "Cat B";
        }

        return "Mouse C";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        catAndMouse(1, 2, 3);
        catAndMouse(1, 3, 2);
    }
}

