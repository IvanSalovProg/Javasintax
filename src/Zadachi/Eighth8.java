package Zadachi;

import java.util.Scanner;

//Ќапишите Java-программу, чтобы определить, €вл€етс€ ли строка или число палиндромом, или нет.
public class Eighth8 {
    public static void main(String[] args) {
String a, b = "";

Scanner q = new Scanner(System.in);
  System.out.println("¬ведите число или сторку");
  a = q.nextLine();
 int s = a.length();

 for(int x = s - 1; x>=0; x--){
     b = b + a.charAt(x);
 }
        System.out.println("перевернутое значение: " + b);

if(a.equals(b)) {
    System.out.println("¬веденное значение €вл€етс€ палиндромом");
}
else
    System.out.println("¬веденное значение не €вл€етс€ палиндромом");


    }
}
