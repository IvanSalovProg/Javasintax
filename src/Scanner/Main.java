package Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
       /* System.out.print("������ ���:");
        String name = enter.nextLine();
        System.out.println("������" + name);*/
        System.out.print("������ ������ �����:");
        int x = enter.nextInt();

        System.out.print("������ ������ �����:");
        int y = enter.nextInt();

        System.out.printf("%s + %s = %s", x,y, y+x );
    }
}
