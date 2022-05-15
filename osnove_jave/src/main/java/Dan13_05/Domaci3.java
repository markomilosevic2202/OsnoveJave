package Dan13_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        Collections.addAll(lista, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println();
        System.out.println("Unesite poziciju koju treba izbaciti: ");
        int pozicuja = s.nextInt();
        if (pozicuja <= lista.size()) {
            for (int i = pozicuja; i < lista.size(); i++) {
                lista.set((i - 1), lista.get(i));
            }
            lista.remove(lista.size() - 1);
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i) + ", ");
            }
        } else {
            System.out.println("Uneli ste nevalidan unos");
        }
    }
}
//Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti (ne u nosi ih korisnik) a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza. Pre i nakon izbacivanja ispisati niz na ekranu. Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
//Primer izvrsenja 1:
//Niz je: 1,3,5,6,7,1,3,4,2,9
//Unesite poziciju za izbacivanje: 5
//Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
//
//Primer izvrsenja 2:
//Niz je: 1,3,5,6,7,1,3,4,2,9
//Unesite poziciju za izbacivanje: 11
//Uneli ste nevalidnu poziciju!
