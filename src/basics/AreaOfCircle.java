package basics;

import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 3.14(radius* radius)
        float rad = sc.nextInt();
        float area = 3.14f *(rad *rad);
        System.out.println(area);

    }
}
