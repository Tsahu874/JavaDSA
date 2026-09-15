package operators;

public class LogicalOperator {
    public static void main(String[] args) {
        //====== AND Operator ========================
        System.out.println("AND OPERATOR--");
        System.out.println((3>2) &&(5>0)); // true AND true
        System.out.println((3<2) &&(5>0)); // false AND true
        System.out.println((3>2) &&(5<0)); // true AND false
        System.out.println((3<2) &&(5<0)); //false AND false
        System.out.println();


        //=======================================================
        System.out.println("OR OPERATOR--");
        System.out.println((3>2) || (5>0)); // true AND true
        System.out.println((3<2) || (5>0)); // false AND true
        System.out.println((3>2) || (5<0)); // true AND false
        System.out.println((3<2) || (5<0)); //false AND false
        System.out.println();

        //=================================================
        System.out.println("NOT OPERATOR--");
        System.out.println(!(3>2));
        System.out.println(!(5<4));

    }
}
