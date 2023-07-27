package Practica;

public class UgolVChasah {
    public static void main(String[] args) {
        System.out.println(angleTime(1,10));

    }

    public static double angleTime(int Hour, int Min){
double angleA = 360/12 * Hour;
double angleB = 360/60 * Min;
double razn = Math.abs(angleB - angleA);
return razn;
    }
}
