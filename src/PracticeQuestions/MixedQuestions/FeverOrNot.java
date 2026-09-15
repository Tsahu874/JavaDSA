package PracticeQuestions.MixedQuestions;

//write code it should print You have a fever if your temperature
//is above 100 and otherwise prints You don't have a fever.

import java.util.*;
public class FeverOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        if(temperature > 100){
            System.out.println("You have fever");
        }

        else{
            System.out.println("You don't have fever");
        }

    }
}
