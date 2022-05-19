package TestJavaOsnove;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jedinicu: ");
        String jedinica = s.next();
        System.out.println("Unesite unesite duzinu u metrima: ");
        double vrednost = s.nextDouble();
        System.out.println(vrednost + " m je " + konverzija(vrednost, jedinica) + jedinica);

    }

    static double konverzija(double a, String jediniac) {
        if (jediniac.equals("cm")) {
            a = a * 100;
        } else if (jediniac.equals("km")) {
            a = a / 1000;

        } else if (jediniac.equals("dc")) {
            a = a * 10;

        }
        return a;
    }
}
