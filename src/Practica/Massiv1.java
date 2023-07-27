package Practica;

public class Massiv1 {
    public static void main(String[] args) {
        int masiv[] = new int[4];

        int[] masiv2 = {1,2,3,4,7};

        for(int i = 0; i < masiv2.length; i++){
            masiv2[i]= masiv2[i] + 3;
        }

        for(int i = 0; i < masiv2.length; i++){
            System.out.println(masiv2[i]);
        }
    }
}
