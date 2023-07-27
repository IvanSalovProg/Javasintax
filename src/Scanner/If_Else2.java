package Scanner;

import java.util.Scanner;

public class If_Else2 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("¬веди число: ");

        int x = enter.nextInt();

        if( x >= 1 ^ x <= 3){
            System.out.println("1 <= x <= 3");
        } else if (x == 4) {
            System.out.println("x = 4");
        } else if (x >= 5 && x <= 6) {
            System.out.println("5 <= x <= 6");
        }
        else System.out.println("Nooooo");
    }
}