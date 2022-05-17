package Domaci16_05;

public class Domaci5 {
    public static void main(String[] args) {
        System.out.println("Celih brojeva ima: " + broji(5,10));
        System.out.println("Celih brojeva ima: " + broji(-5,1));


    }
    static int broji(int x, int y){
       return (y-x-1);
    }
}
