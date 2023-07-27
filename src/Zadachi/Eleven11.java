package Zadachi;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Eleven11 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        System.out.println(maxNumber(208));



        System.out.println(countStrings(Arrays.asList("А", "Б", "А", "С", "")));
        System.out.println(concatStrings(Arrays.asList("кошка123", "тра-ля-ля кошка тра-ля-ля", null, "какой-то текст без слова кошка", "")));
        System.out.println(maxNumber((int) (Math.random() * 900 + 100)));
        System.out.println(concurrenceMethod());
        System.out.println(writeFile());
        System.out.println(search(new int[]{1, 3, 5, 7, 13, 20, 97, 128, 3015, 209074632}, 13));
    }

    /**
     * Напишите метод, который на вход получает List<String>, а возвращает HashMap<String, Integer>,
     * где value - количество вхождений этой строки.
     * на вход - List.of("А","Б", "А", "С", "")
     * на выходе - HashMap со значениями  "А":2, "Б":1, "С":1, "":1
     */
    public static Map<String, Integer> countStrings(List<String> list) {
       /* String delim = "";
        String st = String.join(delim, list);
        String[] words = st.split("");
        HashMap<String,Integer> keyValue = new HashMap<String,Integer>();
        for (int i=0; i<= words.length-1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter+1);
            }
            else {
                keyValue.put(words[i], 1);
            }
        }

        return  keyValue; */

        return list.stream().collect(Collectors.toMap(Function.identity(),e->1,Math::addExact));
    }

    /**
     * Напишите метод, который на вход получает List<String>,
     * а возвращает String представляющий конкатенацию строк которые содержат в себе слоко "кошка"
     * на вход - List.of("кошка123","тра-ля-ля кошка тра-ля-ля", null, "какой-то текст без слова кошка", "")
     * на выходе - "кошка123тра-ля-ля кошка тра-ля-лякакой-то текст без слова кошка"
     */
    public static String concatStrings(List<String> list) {
        /*  StringBuilder result = new StringBuilder();
        for (String value : list) {
            if (Objects.nonNull(value) && value.contains("кошка")) {
                result.append(value);
            }
        }
        return result.toString(); */

       /* String cats = list.stream()
                .filter(Objects::nonNull)
                .filter(e -> e.contains("кошка"))
                .collect(Collectors.joining()); */
return list.stream().filter(Objects::nonNull).filter(e -> e.contains("кошка")).collect(Collectors.joining());

    }

    /**
     * Напишите метод, который на вход получает случайное число, а возвращает его наибольшую цифру.
     * на вход - 208
     * на выходе - 8
     */
    public static String maxNumber(int random) {
        int max = 0;
        while (random != 0) {
            max = Math.max(max, Math.abs(random) % 10);
            random /= 10;
            }
        return String.valueOf(max);
    }


    /**
     * Напишите метод, который будет запускать в отдельном потоке метод maxNumber, и возвращать результат его работы.
     */
    public static String concurrenceMethod() throws ExecutionException, InterruptedException {
       FutureTask<Object> futureTask = new FutureTask<>(() -> maxNumber((int) (Math.random() * 900 + 100)));
      Thread t = new Thread(futureTask);
        System.out.println(Thread.currentThread());
       t.start();

       return (String) futureTask.get();

    }


    /**
     * Напишите метод, который будет запускать метод concurrenceMethod и сохранять его результат в файл.
     * Метод должен вернуть путь до файла
     * на выходе - C:\IdeaProjects\test\file.txt
     */
    public static String writeFile() throws ExecutionException, InterruptedException {
      /*  File file = new File(String.valueOf(concurrenceMethod()));
        if(file.exists()){
            return file.getAbsolutePath();
        }
        return file.getAbsolutePath(); */

     /*    try
        {
            File file = new File("file.txt");
            if(!file.exists()){
            file.createNewFile();}

            PrintWriter pw = new PrintWriter(file);
            pw.println(concurrenceMethod());
            pw.close();
        }
        catch (IOException e) {
            e.printStackTrace();}  */

        String lines = concurrenceMethod();
        BufferedWriter output = null;
        File file = null;
        try {
            file = new File("file.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(lines);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return file.getAbsolutePath();
    }


        /**
     * Напишите метод, который на вход получает отсортированный массив и элемент этого массива,
     * а возвращает индекс, под которым данный элемент находится в массиве.
     * Подсказка - массив может быть очень большим.
     * на вход - {1, 3, 5, 7, 13, 20, 97, 128, 3015, 209074632}, 13
     * на выходе - 4
     */
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
