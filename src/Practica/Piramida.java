package Practica;

import java.util.Scanner;

public class Piramida {
    public static void main(String[] args) {
        int n;
        Scanner enter = new Scanner(System.in);
        do {
            System.out.print("¬ведите высоту пирамиды больше 2 и меньше 5: ");

             n = enter.nextInt();
        }while (n < 2 || n > 5);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
if(j < n - (1 + i)){
    System.out.print(" ");
} else {
    System.out.print("*");
}
            }
            System.out.println();
        }
    }
}
