package Practica;
/*
����� ��������� ����� ��� �������.
        ������� ��� ���������� A � B, ������� ����� �������� �������.
        ������ ��������� ������������� ������ "��������� ����".
        ������ ����� ���� ������������ ����� ������������,
        � �������� ���� ������ (start, ������������) � ����� (end, ��������������).
        �������������, ��� start < end, �.�. ��� ��������� ��������.
        ����� ���� �������������, ��� ��������� ������������� �� ������� ������, �� ������������ �
        �� "�������������" (�� ���������� ������ ������� i � ������ ����������,
        ��� interval[i].end == interval[i + 1].start).
        ����� ����� ��������� (�������� ������) ��������� ����, � ������� ��� ���������� ������
        ����������� �� �������, ���� ��� ����������.

        ������ �����
�� ������� ����� input.txt (��� � ����������� ������ �����) ������ ������ �������� ���������
����������������� ������� � ������� duration.
��������� ������ �������� ���������� ��������� ��� ������ ���� ���������� A countA.
� ��������� countA ������� ���������� ������� ����� � ������ ��������� ���� ���������� A � �������,
���������� ����� ������ �� ����� ������� � ������ ������.
��������� ������ �������� ���������� ��������� ��� ������ ���� ���������� B countB. � ���������
countB ������� ���������� ������� ����� � ������ ��������� ���� ���������� B � �������,
���������� ����� ������ �� ����� ������� � ������ ������.

������ ������
� ������������ ������ ��������� ����� output.txt (��� ����������� ����� ������) �������� ����� ������ �
����� ��������� ����������� ��� ������� � �������, ���������� ����� ������.
���� ������� � ��������� ��������� ����������, �������� � ����� ������ ?1 ?1.

������ 1
����
1
1
2 3
1
1 4

�����
2 3

������ 2
����
1
1
2 3
1
3 4

�����
-1 -1

������ 3
����
6
1
1 10
1
4 12

�����
4 10

������ 4
����
5
0
0

�����
-1 -1

����������
��� ����� �� ������� ������ ���������� 2*10^9.

����������� ������
64.0 ��

����������� �������
1 �

����
����������� ���� ��� input.txt

�����
����������� ����� ��� output.txt
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Yandex {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

      // int duration = enter.nextInt();

       // int countA = enter.nextInt();
       // int countB = enter.nextInt();

        int y = enter.nextInt();
        int z = enter.nextInt();

        int y1 = enter.nextInt();
        int z1 = enter.nextInt();


       /* ArrayList<Integer> list = new ArrayList<Integer>(countA);
        String q = "-1 -1";

        for (int i = y; i < z; i++) {
        }*/


        int [] arr1 = {1,2,2,2,2,2,2,3,6,6,6,6,6,6,};
        int [] arr2 = {7,5,3,6,6,2,2,3,6,6,6,6,6,6,6,6,};

        System.out.println(found(arr1,arr2));

        int [] interA = {y,z};
        int [] interB = {y1,z1};

        Integer [] interalA = {y,z};
        Integer [] interalB = {y1,z1};


        System.out.println(found(interA,interB));
        System.out.println(Arrays.toString(intersectionSet(interalA, interalB)));

    }
    public static ArrayList<Object> found (int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList result = new ArrayList<>();
        int i =0 ;
        int j =0;
        while(i< arr1.length && j<arr2.length){
            if (arr1[i]>arr2[j]){
                j++;

            }else if (arr1[i]<arr2[j]){
                i++;

            }else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }

    public static Integer[] intersectionSet(Integer[] a, Integer[] b){
        return Stream.of(a)
                .filter(new LinkedList<>(Arrays.asList(b))::remove)
                .toArray(Integer[]::new);
    }
}
