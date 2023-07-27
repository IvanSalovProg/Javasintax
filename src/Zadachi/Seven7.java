package Zadachi;

import java.util.Scanner;

//Ќапишите программу на Java, чтобы узнать, €вл€етс€ ли число простым или нет.

/* ќтвет:
ћы объ€вили две целочисленных переменных temp и number и
использовали класс Scanner с nextInt (поскольку у нас может быть на рассмотрении только целое число).
ќбъ€вл€ем логическую переменную numberIsPrime и устанавливаем ее значение - true.
ѕосле этого мы используем цикл for со значением переменной итератора, начинающемс€ с 2.
 оличество итераций, нужное нам, будет равно половине введенного числа.
—четчик итераций увеличиваетс€ на 1 после каждой итерации.
¬ переменную tempNumber мы будем помещать остаток от делени€ значени€ введенного числа на
значение счетчика. ≈сли остаток от делени€ в одной из итераций будет равен 0,
тогда numberIsPrime будет установлен в false, введенное число не будет простым,
и мы выходим из цикла. ≈сли во всех итераци€х мы будем получать в temp некие остатки от делени€,
отличные от нул€ Ц число будет простым. ќсновыва€сь на значении numberIsPrime, мы приходим к выводу,
€вл€етс€ ли наше число простым или нет.
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

            System.out.println(number + " число €вл€етс€ простым");
        else
            System.out.println(number + " число не €вл€етс€ простым");
    }
}
