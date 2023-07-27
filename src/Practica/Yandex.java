package Practica;
/*
Найти ближайшее время для встречи.
        Имеются два сотрудника A и B, которые хотят провести встречу.
        Каждый сотрудник предоставляет список "свободных окон".
        Каждое такое окно представляет собой полуинтервал,
        у которого есть начало (start, включительно) и конец (end, невключительно).
        Гарантируется, что start < end, т.е. все интервалы непустые.
        Кроме того гарантируется, что интервалы отсортированы по времени начала, не пересекаются и
        не "соприкасаются" (не существует такого индекса i в списке интервалов,
        что interval[i].end == interval[i + 1].start).
        Нужно найти ближайшее (наиболее раннее) временное окно, в которое оба сотрудника смогут
        участвовать во встрече, если оно существует.

        Формат ввода
Во входном файле input.txt (или в стандартном потоке ввода) первая строка содержит требуемую
продолжительность встречи в минутах duration.
Следующая строка содержит количество доступных для встреч окон сотрудника A countA.
В следующих countA строках содержатся времена начал и концов свободных окон сотрудника A в минутах,
соединённые через пробел по одной встрече в каждой строке.
Следующая строка содержит количество доступных для встреч окон сотрудника B countB. В следующих
countB строках содержатся времена начал и концов свободных окон сотрудника B в минутах,
соединённые через пробел по одной встрече в каждой строке.

Формат вывода
В единственную строку выходного файла output.txt (или стандартный поток вывода) запишите время начала и
конца найденной возможности для встречи в минутах, соединённое через пробел.
Если встреча с заданными условиями невозможна, запишите в ответ строку ?1 ?1.

Пример 1
Ввод
1
1
2 3
1
1 4

Вывод
2 3

Пример 2
Ввод
1
1
2 3
1
3 4

Вывод
-1 -1

Пример 3
Ввод
6
1
1 10
1
4 12

Вывод
4 10

Пример 4
Ввод
5
0
0

Вывод
-1 -1

Примечание
Все числа во входных данных ограничены 2*10^9.

Ограничение памяти
64.0 Мб

Ограничение времени
1 с

Ввод
стандартный ввод или input.txt

Вывод
стандартный вывод или output.txt
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
