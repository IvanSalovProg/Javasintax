package Zadachi;

import java.util.Scanner;

//�������� ��������� �� Java ��� ���������� ������������������ �������� � ������
// ��� ������������� ���������� � String ������� reverse().
public class Second {
    public static void main(String[] args) {

        String s = "������ ���������������";

char x[] = s.toCharArray();
for(int i = x.length -1 ; i >= 0; i--){
    System.out.print(x[i]);
}

        //������ ������
        String st;
        Scanner scannerQ = new Scanner(System.in);
        System.out.println();
        System.out.println("������� ���� ������:");
        st = scannerQ.nextLine();
        String[] temp = st.split("");    //���������� ����� split ��� ������ ������ � �������� �������

        for(int y= temp.length-1; y>=0; y--)
        {
            System.out.print(temp [y] + "");
        }

        //������ ������
        String mainString, reverseString = "";
        System.out.println();
        System.out.println("������� ������ ������, ����� �������� ������������:");
        Scanner scannerQ1 = new Scanner(System.in);
        mainString = scannerQ1.nextLine();

        int stringLength = mainString.length();

        for(int z= stringLength -1; z>=0; z--) {
  reverseString = reverseString + mainString.charAt(z);   //���������� ���������� ����� charAt() ����� ����������� ������
        }
        System.out.println(reverseString);
    }
}
