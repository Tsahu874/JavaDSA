package loops.whileLoop;

import java.util.*;
public class numbers1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        int counter = 1;

        while(counter <= n){
            System.out.println(counter);
            counter++;
        }
    }
}
