package Zadachi;

//Напишите программу на Java для переворачивания строки, изменив расположение символов в строке
// задом наперёд без использования встроенных в String функций.
public class First {

    public static void main(String[] args) {
String s = "Задача1";

StringBuilder x = new StringBuilder();
x.append(s);
x = x.reverse();
        System.out.println(x);
    }
}
