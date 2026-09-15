package PracticeQuestions.conditionalstatements;
// print largest of two numbers

import java.util.*;
public class PracticeQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          //===========If else Statements===========
//        System.out.print("Enter A's value: ");
//        int A = sc.nextInt();
//        System.out.print("Enter B's value: ");
//        int B = sc.nextInt();
//
//        if(A>=B){
//            System.out.println("A is larger");
//        }
//        else{
//            System.out.println("B is larger");
//        }
//



//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        if(num%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }


        //========else if Statements=========
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Adult : drive, vote");
        }
        else if(age> 13 && age <18){
            System.out.println("Teenager");
        }
        else{
            System.out.print("Not adult");
        }


    }
}
