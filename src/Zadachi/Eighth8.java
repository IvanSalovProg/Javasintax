package Zadachi;

import java.util.Scanner;

//�������� Java-���������, ����� ����������, �������� �� ������ ��� ����� �����������, ��� ���.
public class Eighth8 {
    public static void main(String[] args) {
String a, b = "";

Scanner q = new Scanner(System.in);
  System.out.println("������� ����� ��� ������");
  a = q.nextLine();
 int s = a.length();

 for(int x = s - 1; x>=0; x--){
     b = b + a.charAt(x);
 }
        System.out.println("������������ ��������: " + b);

if(a.equals(b)) {
    System.out.println("��������� �������� �������� �����������");
}
else
    System.out.println("��������� �������� �� �������� �����������");


    }
}
