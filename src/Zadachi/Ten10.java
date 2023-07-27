package Zadachi;
//Напишите Java-программу для обхода ArrayList с использованием цикла for, while и улучшенного цикла for.

import java.io.File;
import java.util.*;

/*
В этой программе мы добавили три элемента в ArrayList и вывели его размер.
Затем мы используем цикл While с итератором. Всякий раз, когда итератор получает следующий элемент,
он будет отображать этот элемент, пока мы не достигнем конца списка.
В нашем случае это будет повторяться три раза.

Аналогично, мы сделали для улучшенного цикла for,
где мы создали объект o для ArrayList с именем testList. Затем вывели на экран значение объекта.

После этого мы создали цикла for, где итератор i установлен сначала на индекс 0,
а затем увеличивается на 1 при каждой итерации, пока не будет достигнут предел ArrayList.
Наконец, мы выводим на экран каждый элемент, используя метод get(index) для каждой итерации цикла for.
 */
public class Ten10 {

    public static void main(String[] args) {
        System.out.println(countStrings(Arrays.asList("А", "Б", "А", "С", "")));
        System.out.println(maxNumber((int) (Math.random() * 900 + 100)));
        System.out.println(maxNumber(208));


        System.out.println(countStrings(Arrays.asList("А", "Б", "А", "С", "")));
        System.out.println(concatStrings(Arrays.asList("кошка123", "тра-ля-ля кошка тра-ля-ля", null, "какой-то текст без слова кошка", "")));
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
