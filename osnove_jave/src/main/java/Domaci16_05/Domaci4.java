package Domaci16_05;

import java.util.Scanner;

public class Domaci4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj stampe:");
        int n = s.nextInt();
        System.out.println("Unesite karakter: ");
        String karakter = s.next();
        stampa(n, karakter);
    }

    static void stampa(int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");
        }
    }
}
