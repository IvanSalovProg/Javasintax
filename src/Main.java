import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    /*
Программа должна создавать массив из 12 случайных целых чисел из отрезка  [-10;10] таким образом,
чтобы отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок
следования элементов должен быть случайным (т.е. не подходит вариант, когда в массиве постоянно
выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же тогда, когда постоянно
чередуются через один и пр.). Вывести полученный массив на экран.
    */
    public static void main (String[] args){
        int mas[] = new int[12];
        int masQuele[] = new int[mas.length/2];

        for (int i = 0; i < masQuele.length; i++){
            int value = (int)(1 + (Math.random()*(2)));
            masQuele[i] = value;
        }
        System.out.println(Arrays.toString(masQuele) + " - masQuele ");

        for (int i = 0; i < masQuele.length/2; i++){
            if (masQuele[i] == 1){
                int value = (int)(1 + (Math.random()*(10)));
                mas[i] = value;
            } else if (masQuele[i] == 2) {
                int value = (int)(-11 + (Math.random()*(10)));
                mas[i] = value;
            }
        }
        for (int j = mas.length/2, i = 0; j < mas.length; j++, i++){
            if (masQuele[i] == 2) {
                int value = (int)(1 + (Math.random()*(10)));
                mas[j] = value;
            } else if (masQuele[i] == 1) {
                int value = (int)(-11 + (Math.random()*(10)));
                mas[j] = value;
            }
        }

        System.out.println(Arrays.toString(mas) + " - mas");

    for(int i = 0; i < mas.length; i++){
    int min = mas[i];
    int min_i = i;

        for(int j = i + 1; j < mas.length; j++){
if(mas[j] < min){
    min = mas[j];
    min_i = j;
}}
     if(i != min_i){
int tmp = mas[i];
mas[i] = mas [min_i];
mas[min_i] = tmp;
     }

}
System.out.println("Выведение массива ОТСОРТИРОВАННОГО по возрастанию (для проверки правильности кода)");

    for(int i = 0; i < mas.length; i++){
System.out.print((mas[i]) + " ");
    }
    }
}
