package Zadachi;

import java.util.Scanner;

//�������� ��������� �� Java ��� ����,
// ����� �������� ������� ��������, ���������� � ���� ���������� � ������� ������� ����������
public class Third {
    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("������� �������� a � b");
        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt();
        b = scannerQ.nextInt();
        System.out.println("�� ������ ���������� " + a + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("����� ������ ���������� " + a + b);
    }
}
