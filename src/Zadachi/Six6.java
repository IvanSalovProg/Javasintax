package Zadachi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//�������� Java-��������� ��� �������� ������� ���� HashMap
// � �������������� ����� while � ����������� ����� for.

/* �����:
����� �� ��� ������ �������� ��� �������� � ���������� ���� HashMap � ������ keyValue,
��������� ������� put(). ������ ���������� keyValue ����� �������� � ������� ������ size().
����� ����� �� ������������ ���� While ��� ������ keyValue,
������� �������� �� ����� ���� ����-�������� ��� ������� ��������.
����� � �������� ����� ���� �������� � ������� ������� getKey() � getValue().
����������, �� ���������� ����������� ���� for, �� ��������� �qurentMe2� � HashMap. */

public class Six6 {
    public static void main(String[] args) {
        HashMap<Integer, String> keyValue = new HashMap<Integer, String>();

        keyValue.put(1, "Hello");

        keyValue.put(2, "World");

        keyValue.put(3, "Have a nice day!");

        System.out.println(keyValue.size());

        System.out.println("���� While:");

        Iterator iter = keyValue.entrySet().iterator();

        while (iter.hasNext()) {

            Map.Entry qurentMe = (Map.Entry) iter.next();

  System.out.println("���� ��� " + qurentMe.getKey() + " �������� ��� " + qurentMe.getValue());

        }

        System.out.println("���� For:");

        for (Map.Entry qurentMe2 : keyValue.entrySet()) {

  System.out.println("���� ���: " + qurentMe2.getKey() + " �������� ���: " + qurentMe2.getValue());
        }
    }
}
