package Zadachi;

import java.util.Scanner;

//Напишите программу на Java для переворота последовательности символов в строке
// без использования встроенной в String функции reverse().
public class Second {
    public static void main(String[] args) {

        String s = "Учимся программировать";

char x[] = s.toCharArray();
for(int i = x.length -1 ; i >= 0; i--){
    System.out.print(x[i]);
}

        //Второй способ
        String st;
        Scanner scannerQ = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите вашу строку:");
        st = scannerQ.nextLine();
        String[] temp = st.split("");    //используем метод split для вывода строки в обратном порядке

        for(int y= temp.length-1; y>=0; y--)
        {
            System.out.print(temp [y] + "");
        }

        //Третий способ
        String mainString, reverseString = "";
        System.out.println();
        System.out.println("Введите нужную строку, чтобы получить перевернутую:");
        Scanner scannerQ1 = new Scanner(System.in);
        mainString = scannerQ1.nextLine();

        int stringLength = mainString.length();

        for(int z= stringLength -1; z>=0; z--) {
  reverseString = reverseString + mainString.charAt(z);   //используем встроенный метод charAt() чтобы перевернуть строку
        }
        System.out.println(reverseString);
    }
}
