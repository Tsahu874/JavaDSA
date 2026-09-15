package conditionalstatements;

public class SwitchCase {
    public static void main(String[] args) {
        int number = 6;
        char ch = 'k';

        switch(number){
            case 1 :
                System.out.println("Samosa");
                break;
            case 2 :
                System.out.println("Burger");
                break;

            case 3 :
                System.out.println("Mango Shake");
                break;

            default :
                System.out.println("Nothing");
        }

        switch(ch){
            case 'd' :
                System.out.println("Deepa");
                break;

            case 'l' :
                System.out.println("Laxmi");
                break;

            case 'k' :
                System.out.println("Kanchan");
                break;

            case 'p' :
                System.out.println("Preeti");
                break;

            case 't' :
                System.out.println("Tanu");
                break;

            default :
                System.out.println("Not siblings");
        }
    }
}
