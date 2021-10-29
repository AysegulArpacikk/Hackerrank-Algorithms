package Easy;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result9 {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for(int i=0; i<grades.size(); i++) {
            if((grades.get(i) + 1) % 5 == 0 && grades.get(i) + 1 >= 40) {
                grades.set(i, grades.get(i) + 1);
            }
            if((grades.get(i) + 2) % 5 == 0 && grades.get(i) + 2 >= 40) {
                grades.set(i, grades.get(i) + 2);
            }
        }

        System.out.println(grades);

        return grades;
    }

}

class GradingStudents {
    public static void main(String[] args) throws IOException {

        List<Integer> grades = Arrays.asList(73, 67, 38, 33);

        Result9.gradingStudents(grades);

    }
}
