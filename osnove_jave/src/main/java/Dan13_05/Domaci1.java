package Dan13_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList<>();
        Collections.addAll(lista, 2,4,6,7,4,4,2,5,1,4,1,4,9,4,5,4,8,5,4,7,4,4,7,4,1);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if(i%5==4){
                System.out.println();
            }
        }

        System.out.println("Unesite poziciju: ");
        int pozicuja = s.nextInt();
        int suma = lista.get(pozicuja);
        if((pozicuja - 1) >0){
            suma = suma + lista.get(pozicuja-1);
        }
        if((pozicuja + 1) < lista.size()){
            suma = suma + lista.get(pozicuja+1);
        }
        if((pozicuja - 5) >0){
            suma = suma + lista.get(pozicuja-5);
        }
        if((pozicuja + 5) < lista.size()){
            suma = suma + lista.get(pozicuja+5);
        }
        System.out.println("Suma je: "+suma);

    }
}
//Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5. Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad, ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//Za racunanje sume, nije potrebna petlja!
//
//U projektu kreirati paket za ovaj domaci d13_05_2022 i u njemu klasu Zadatak1.java i postavite tekst zadataka u komentaru a zatim commit-ujte promenu i push-ujte na github sa porukom “Domaci 13.05.2022 Zadatak 1”
//
//Primer izvrsenja:
//2,4,6,7,4,
//4,2,5,1,4,
//1,4,9,4,5,
//4,8,5,4,7,
//4,4,7,4,1,
//Unesite poziciju: 12
//Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku)
