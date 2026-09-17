package PracticeQuestions.patterns;

import java.util.*;

public class invertedHalfPyramid {
    public static void main(String[] args) {

        int n = 4;
        //for (int line = n; line >= 1; line--) {
        //    for (int star = 1; star <= line; star++) {
        //        System.out.print(" * ");
        //    }
        //    System.out.println();
        // }


        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i + 1; s++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
