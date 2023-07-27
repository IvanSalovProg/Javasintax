package Zadachi;
//�������� Java-��������� ��� ������ ArrayList � �������������� ����� for, while � ����������� ����� for.

import java.io.File;
import java.util.*;

/*
� ���� ��������� �� �������� ��� �������� � ArrayList � ������ ��� ������.
����� �� ���������� ���� While � ����������. ������ ���, ����� �������� �������� ��������� �������,
�� ����� ���������� ���� �������, ���� �� �� ��������� ����� ������.
� ����� ������ ��� ����� ����������� ��� ����.

����������, �� ������� ��� ����������� ����� for,
��� �� ������� ������ o ��� ArrayList � ������ testList. ����� ������ �� ����� �������� �������.

����� ����� �� ������� ����� for, ��� �������� i ���������� ������� �� ������ 0,
� ����� ������������� �� 1 ��� ������ ��������, ���� �� ����� ��������� ������ ArrayList.
�������, �� ������� �� ����� ������ �������, ��������� ����� get(index) ��� ������ �������� ����� for.
 */
public class Ten10 {

    public static void main(String[] args) {
        System.out.println(countStrings(Arrays.asList("�", "�", "�", "�", "")));
        System.out.println(maxNumber((int) (Math.random() * 900 + 100)));
        System.out.println(maxNumber(208));


        System.out.println(countStrings(Arrays.asList("�", "�", "�", "�", "")));
        System.out.println(concatStrings(Arrays.asList("�����123", "���-��-�� ����� ���-��-��", null, "�����-�� ����� ��� ����� �����", "")));
        System.out.println(maxNumber((int) (Math.random() * 900 + 100)));
        System.out.println(concurrenceMethod());
        System.out.println(writeFile());
        System.out.println(search(new int[]{1, 3, 5, 7, 13, 20, 97, 128, 3015, 209074632}, 13));
    }


    public static Map<String, Integer> countStrings(List<String> list) {
        String delim = "";
        String st = String.join(delim, list);
        String[] words = st.split("");
        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();
        for (int i = 0; i <= words.length - 1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter + 1);
            } else {
                keyValue.put(words[i], 1);
            }
        }

        return keyValue;
    }

    public static int maxNumber(int random) {
        int b = (Math.abs(random));

        if (random != 0) {
            int max = 0;
            while (random > 0) {
                if (random % 10 > max) max = (int) (random % 10);
                random /= 10;
            } return max;
        } else return 0;
    }

    public static String concatStrings(List<String> list) {
       // ArrayList<String> strSizes = new ArrayList<String>();
        /*for (String str : list) {
            if ((str.length() % 5) == 0) {
                strSizes.add(str);
            }
        }
        return String.valueOf(strSizes); */
        String delimeter = "";
        String str = String.join(delimeter, list);

        return str;
    }


    public static int concurrenceMethod() {
      /* int a = 0;
        new Thread(() -> {
            System.out.println(maxNumber(a));
            // code goes here.
        }).start();
        return a; */
        return 0;
    }

    public static String writeFile() {
        File file = new File(String.valueOf(concurrenceMethod()));
        if(file.exists()){
            return file.getAbsolutePath();
        }
        return file.getAbsolutePath();
    }

    public static int search(int[] sortedArray, int element) {
        for (int i = 0; i < sortedArray.length; i++)
        {
            if (sortedArray[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
