package Scanner;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("Ведите число: ");

   int x = enter.nextInt();

        if(x > 0){
            System.out.print("Yes больше");
        }
       else if(x == 0){
            System.out.print("x=0");
        }
        else {
            System.out.println("No меньше");
        }
    }
}
