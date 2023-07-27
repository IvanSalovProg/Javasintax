package Practica;

public class KvadratnoeUravnenie {

    public static void main(String[] args) {


        double a, b, c;
        double x1 , x2;

        a = 4;
        b = 15;
        c = 6;

        double Discreminant = b * b - 4 * a * c;

        if (Discreminant == 0){
       x1 = (-b)/(2 * a);

            System.out.printf("x1 = x2 = %s", x1);
        }
        else if (Discreminant > 0){
            x1 = (-b + Math.sqrt(Discreminant))/(2 * a);
            x2 = (-b - Math.sqrt(Discreminant))/(2 * a);

            System.out.printf("x1 = %s, x2 = %s", x1, x2);
        }
        else {
            System.out.println("Ќет целого решени€, так как дискрименант < 0");
        }

    }

}