package PracticeQuestions.operators;

public class PracticeQues {
    public static void main(String[] args) {

        //====QEUSTION 1 =========================

        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.println("Ques 1--");
        System.out.println(exp1 + ",");
        System.out.println(exp2);
        System.out.println();

        //======QUESTION 2 ====================================
        int a = 200, b = 50, c = 100;

        System.out.println("Ques 2--");
        if (a > b && b > c) {
            System.out.println("Hello");
        }

        if (c> b && c < a) {
            System.out.println("Java");
        }

        if((b+200) < a && (b+150)< c){
            System.out.println("Hello java");
        }


        //==========QUESTION 3=========================


    }
}
