package conditionalstatements;

import java.util.*;
public class CalcUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        float a = sc.nextFloat();

        System.out.print("Enter Operator = ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter B = ");
        float b = sc.nextFloat();
        switch(operator){
            case '+' :
                System.out.println(a+b);
                break;

            case '-' :
                System.out.println(a-b);
                break;

            case '*' :
                System.out.println(a*b);
                break;

            case '/' :
                System.out.println(a/b);
                break;

            case '%' :
                System.out.println(a%b);
                break;

            default :
                System.out.println("Wrong Operator ");
        }
    }
}
