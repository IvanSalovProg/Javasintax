package Zadachi;

import java.util.Scanner;

//�������� ��������� �� Java, ����� �������� ������� ��������,
// ���������� � ���� ����������, ��� ������������� ������� ����������.
public class Four {
    public static void main(String[] args) {
        int a, b;
        System.out.println("������� ������ �������� a � b");
        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt();
        b = scannerQ.nextInt();
        System.out.println("�� ������ ����������\na = "+a+"\nb = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("����� ������ ���������� ��� ������������� ����������\na = "+a+"\nb = "+b);
    }
}
