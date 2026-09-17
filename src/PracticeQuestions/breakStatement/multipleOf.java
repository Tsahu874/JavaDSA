package PracticeQuestions.breakStatement;


// keep entering the number till user enters a multiple of 10.
import java.util.*;
public class multipleOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num % 10 == 0){
                System.out.println("You entered multiple of 10.");
                break;
            }

        } while(true);

    }
}
