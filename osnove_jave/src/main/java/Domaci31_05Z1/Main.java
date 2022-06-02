package Domaci31_05Z1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> listIgrac = new ArrayList<>();

        System.out.println("Koliko igraca zelis da dodas: ");
        int brDodavanihIgraca = s.nextInt();
        for (int i = 0; i < brDodavanihIgraca; i++) {
            System.out.println("Unesite ime i prezime: ");
            String imePrezime = s.next();
            System.out.println("Unesite godinu rodjenja: ");
            int godinaRodjenja = s.nextInt();
            System.out.println("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.println("Broj: ");
            int broj = s.nextInt();
            System.out.println("Poziciju: ");
            String poziciju = s.next();
            System.out.println("Kapiten: ");
            boolean kapiten = s.nextBoolean();

            listIgrac.add(new Igrac(imePrezime, jmbg, godinaRodjenja, broj, poziciju, kapiten));
        }
        ArrayList<Trener> listTrener = new ArrayList<>();
        System.out.println("Koliko trenera zelis da dodas: ");
        int brDodavanihTrenera = s.nextInt();
        for (int i = 0; i < brDodavanihTrenera; i++) {
            System.out.println("Unesite ime i prezime: ");
            String imePrezime = s.next();
            System.out.println("Unesite godinu rodjenja: ");
            int godinaRodjenja = s.nextInt();
            System.out.println("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.println("Godine iskustva: ");
            int godineIskustva = s.nextInt();
            System.out.println("Tip: ");
            String tip = s.next();


            listTrener.add(new Trener(imePrezime, jmbg, godinaRodjenja, godineIskustva, tip));
        }
        for (int i = 0; i < brDodavanihIgraca; i++) {
            listIgrac.get(i).stampa();

        }
        for (int i = 0; i < brDodavanihTrenera; i++) {
            listTrener.get(i).stampa();
        }

        // U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.


        //(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.


    }
}
