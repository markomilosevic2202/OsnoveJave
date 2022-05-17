package Domaci16_05;

public class Domaci6 {
    public static void main(String[] args) {
        System.out.println("Najniza vrednost je: " + vracaNajmanji(7, 6, 1));
    }

    static int vracaNajmanji(int a, int b, int c) {
        int max = a;
        if (max > b) {
            max = b;
        }
        if (max > c) {
            max = c;
        }
        return max;

    }
}
