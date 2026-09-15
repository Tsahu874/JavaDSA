package basics;

public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);
        // char c = a-b;
        // System.out.println(c);

        short d = 5;
        byte e = 25;
        char f = 'f';
        //byte bt = d+e+f;

        int num1 = 10;
        float num2 = 20.25f;
        long c = 25;
        double num3 = 30;
        double ans = num1 + num2 + c +num3;
        System.out.println(ans);

        byte j = 5;
        byte k = (byte) (j*2);
        System.out.println(k);

    }
}
