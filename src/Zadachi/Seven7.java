package Zadachi;

import java.util.Scanner;

//�������� ��������� �� Java, ����� ������, �������� �� ����� ������� ��� ���.

/* �����:
�� �������� ��� ������������� ���������� temp � number �
������������ ����� Scanner � nextInt (��������� � ��� ����� ���� �� ������������ ������ ����� �����).
��������� ���������� ���������� numberIsPrime � ������������� �� �������� - true.
����� ����� �� ���������� ���� for �� ��������� ���������� ���������, ������������ � 2.
���������� ��������, ������ ���, ����� ����� �������� ���������� �����.
������� �������� ������������� �� 1 ����� ������ ��������.
� ���������� tempNumber �� ����� �������� ������� �� ������� �������� ���������� ����� ��
�������� ��������. ���� ������� �� ������� � ����� �� �������� ����� ����� 0,
����� numberIsPrime ����� ���������� � false, ��������� ����� �� ����� �������,
� �� ������� �� �����. ���� �� ���� ��������� �� ����� �������� � temp ����� ������� �� �������,
�������� �� ���� � ����� ����� �������. ����������� �� �������� numberIsPrime, �� �������� � ������,
�������� �� ���� ����� ������� ��� ���.
*/

public class Seven7 {
    public static void main(String[] args) {
        int number;
        boolean numberIsPrime = true;
        Scanner scannerQ = new Scanner(System.in);
        number = scannerQ.nextInt();
        scannerQ.close();

        for (int x = 2; x<= number /2; x++) {

            int tempNumber = number % x;

            if (tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }
        if(numberIsPrime)

            System.out.println(number + " ����� �������� �������");
        else
            System.out.println(number + " ����� �� �������� �������");
    }
}
