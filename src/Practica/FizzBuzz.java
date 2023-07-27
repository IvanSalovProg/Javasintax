package Practica;

public class FizzBuzz {
    public static void main(String[] args) {
fizzBuzz(100);
    }

    public static void fizzBuzz(int n){
        for(int count = 1; count <= n; count++){
            if(count%3 == 0 && count%5 == 0) {
                System.out.println("Fizz Buzz");
            }
            else if (count%3 == 0) {
                System.out.println("Fizz");
            }
            else if (count%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(count);
            }
        }
    }
}
