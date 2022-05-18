package TestVezba;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int uslov = 0;
        System.out.println("Unesite broj: ");
        int vrednost = s.nextInt();
        int suma = 0;
        while (uslov != 2) {
            suma = suma + vrednost;
            System.out.println("Unesite broj: ");
            vrednost = s.nextInt();
            if (vrednost != 0) {

                uslov = 0;
            } else {
                uslov++;
            }

        }


        System.out.println("Suma je: " + suma);
    }
}
