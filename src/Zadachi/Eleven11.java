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



        System.out.println(countStrings(Arrays.asList("�", "�", "�", "�", "")));
        System.out.println(concatStrings(Arrays.asList("�����123", "���-��-�� ����� ���-��-��", null, "�����-�� ����� ��� ����� �����", "")));
        System.out.println(maxNumber((int) (Math.random() * 900 + 100)));
        System.out.println(concurrenceMethod());
        System.out.println(writeFile());
        System.out.println(search(new int[]{1, 3, 5, 7, 13, 20, 97, 128, 3015, 209074632}, 13));
    }

    /**
     * �������� �����, ������� �� ���� �������� List<String>, � ���������� HashMap<String, Integer>,
     * ��� value - ���������� ��������� ���� ������.
     * �� ���� - List.of("�","�", "�", "�", "")
     * �� ������ - HashMap �� ����������  "�":2, "�":1, "�":1, "":1
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
     * �������� �����, ������� �� ���� �������� List<String>,
     * � ���������� String �������������� ������������ ����� ������� �������� � ���� ����� "�����"
     * �� ���� - List.of("�����123","���-��-�� ����� ���-��-��", null, "�����-�� ����� ��� ����� �����", "")
     * �� ������ - "�����123���-��-�� ����� ���-��-�������-�� ����� ��� ����� �����"
     */
    public static String concatStrings(List<String> list) {
        /*  StringBuilder result = new StringBuilder();
        for (String value : list) {
            if (Objects.nonNull(value) && value.contains("�����")) {
                result.append(value);
            }
        }
        return result.toString(); */

       /* String cats = list.stream()
                .filter(Objects::nonNull)
                .filter(e -> e.contains("�����"))
                .collect(Collectors.joining()); */
return list.stream().filter(Objects::nonNull).filter(e -> e.contains("�����")).collect(Collectors.joining());

    }

    /**
     * �������� �����, ������� �� ���� �������� ��������� �����, � ���������� ��� ���������� �����.
     * �� ���� - 208
     * �� ������ - 8
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
     * �������� �����, ������� ����� ��������� � ��������� ������ ����� maxNumber, � ���������� ��������� ��� ������.
     */
    public static String concurrenceMethod() throws ExecutionException, InterruptedException {
       FutureTask<Object> futureTask = new FutureTask<>(() -> maxNumber((int) (Math.random() * 900 + 100)));
      Thread t = new Thread(futureTask);
        System.out.println(Thread.currentThread());
       t.start();

       return (String) futureTask.get();

    }


    /**
     * �������� �����, ������� ����� ��������� ����� concurrenceMethod � ��������� ��� ��������� � ����.
     * ����� ������ ������� ���� �� �����
     * �� ������ - C:\IdeaProjects\test\file.txt
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
     * �������� �����, ������� �� ���� �������� ��������������� ������ � ������� ����� �������,
     * � ���������� ������, ��� ������� ������ ������� ��������� � �������.
     * ��������� - ������ ����� ���� ����� �������.
     * �� ���� - {1, 3, 5, 7, 13, 20, 97, 128, 3015, 209074632}, 13
     * �� ������ - 4
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
