package TestVezba;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u evrima ");
        double vrednost = s.nextDouble();
        System.out.println("Unesite valutu ");
        String valuta = s.next();

        if (valuta.equals("rsd")) {
            System.out.println("Imate: " + rsd(vrednost) + valuta);
        } else if (valuta.equals("usd")) {
            System.out.println("Imate: " + usd(vrednost) + valuta);
        } else if (valuta.equals("rub")) {
            System.out.println("Imate: " + rub(vrednost) + valuta);
        }


    }


    static double rsd(double a) {
        return a * 117.2113;
    }

    static double usd(double a) {
        return a * 1.1821;
    }

    static double rub(double a) {
        return a * 89.2323;
    }

}
