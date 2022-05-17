package TestVezba;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite tezinu: ");
        double tezina = s.nextDouble();
        System.out.println("Unesite visinu: ");
        double visina = s.nextDouble();
        double bmi = tezina / visina;
        if (bmi < 18.5) {
            System.out.println("Neuhranjenost");
        } else if (bmi > 18.5 && bmi < 24.99) {
            System.out.println("Normalana težina");
        } else if (bmi > 25 && bmi < 29.99) {
            System.out.println("Prekomerna težina");
        } else {
            System.out.println("Gojaznost");
        }
    }
}
