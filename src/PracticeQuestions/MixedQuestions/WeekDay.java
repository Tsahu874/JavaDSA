package PracticeQuestions.MixedQuestions;

//Write a Java program to input week number(1-7)
// and print day of week name using switch case.

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number b/w 1-7 : ");
        int day = sc.nextInt();

        switch (day) {
            case 1 :
                System.out.println("It's Sunday");
                break;

            case 2 :
                System.out.println("It's Monday");
                break;

            case 3 :
                System.out.println("It's Tuesday");
                break;

            case 4 :
                System.out.println("It's Wednesday");
                break;

            case 5 :
                System.out.println("It's Thursday");
                break;

            case 6 :
                System.out.println("It's Friday");
                break;

            case 7 :
                System.out.println("It's Saturday");
                break;

            default:
                System.out.println("error: enter number between 1 to 7 only ");


        }
    }
}
