package PracticeQuestions.MixedQuestions;//Enter cost of 3 items from the user(using float datatype)
// -a pencil,a pen and an eraser.
// You have to output the total cost of the items
// back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to
// the items in the bill as an advanced problem)

import java.util.Scanner;

public class BillCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float pencil = sc.nextFloat();
            float pen = sc.nextFloat();
            float eraser = sc.nextFloat();
            float total_cost = pencil+ pen+ eraser;
            System.out.println("Bill is: " +total_cost);

            //Add on - with 18% gst
            float newTotal = total_cost +(0.18f * total_cost);
            System.out.println("Bill with 18% gst tax : " +newTotal);

        }

}
