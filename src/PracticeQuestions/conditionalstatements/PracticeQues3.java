package PracticeQuestions.conditionalstatements;

import java.util.*;

//print the largest of 3
public class PracticeQues3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A's value: ");
        int A = sc.nextInt();

        System.out.print("Enter B's value: ");
        int B = sc.nextInt();

        System.out.print("Enter C's value: ");
        int C = sc.nextInt();

        if(A>= B && A>=C){
            System.out.println("Among a, b, c : " + A +" that is A is largest" );
        }

        else if(B>=C){
            System.out.println("Among a, b, c : " + B +" that is B is largest" );
        }

        else{
            System.out.println("Among a, b, c : " + C +" that is C is largest" );
        }

    }
}
