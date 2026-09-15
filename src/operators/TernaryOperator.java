package operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 4;

        String type = ((number % 2) ==0) ? "even" : "odd";
        System.out.println(type);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        String reportCard = marks>= 30 ? "Pass": "Fail";
        System.out.println(reportCard);
    }
}
