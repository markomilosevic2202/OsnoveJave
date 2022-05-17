package TestVezba;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean uslov = true;
        System.out.println("Unesite broj: ");
        int vrednost = s.nextInt();
        int suma = vrednost;

        while (!(vrednost != 0 && uslov != false)) {
            if (vrednost != 0) {
                suma = suma + vrednost;
                System.out.println("Unesite broj: ");
                vrednost = s.nextInt();
                uslov = true;
            }

            else {uslov = false;}

        }


        System.out.println("Suma je: " + suma);
    }
}
