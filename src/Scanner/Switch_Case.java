package Scanner;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("¬веди число: ");

        int x = enter.nextInt();

        switch (x)
        {
            case 1:
                System.out.println("x=1");
                break;

            case 2:
                System.out.println("x=2");
                break;

            case 3:
                System.out.println("x=3");
                break;

            default:
                System.out.println("Noooooo");
                break;
        }

        System.out.println("Exit");



    }
}
