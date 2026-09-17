package PracticeQuestions.loopsQuestions;


//Write a program to find the factorial
// of any number entered by the user.

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;

        }
        System.out.println("factorial of " + n + " is " + fact);
    }
}
