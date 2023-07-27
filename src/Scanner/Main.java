package Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
       /* System.out.print("Ведите имя:");
        String name = enter.nextLine();
        System.out.println("Привет" + name);*/
        System.out.print("Ведите первое число:");
        int x = enter.nextInt();

        System.out.print("Ведите второе число:");
        int y = enter.nextInt();

        System.out.printf("%s + %s = %s", x,y, y+x );
    }
}
