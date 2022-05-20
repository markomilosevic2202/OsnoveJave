package Dan19_05;

public class MainAuto {
    public static void main(String[] args) {
        Auto seat = new Auto();
        seat.ime = "Marko";
        seat.prezime = "Milosevic";
        seat.marka = "Seat";
        seat.brojVrata = 5;
        seat.potrosnja = 7;
        seat.brzina = 120;
        seat.mesecRegistracije = 5;
        seat.kubikaza = 1800;
        seat.godinaProizvodnje = 1948;
        seat.trenutnaKolicinaGoriva = 58;
        seat.kapacitetRezervuara = 60;

        seat.stampa();
        if (seat.oldTimer())
            System.out.println("Auto je old timer");
        else {
            System.out.println("Auto nije oldtimer");
        }
        if (seat.idteklaRegistracija(6))
            System.out.println("Auto je registrovan");
        else {
            System.out.println("Auto registrovan");
        }
        System.out.println("Cena registracije: " + seat.cenaRegistracije());
        System.out.println("Cena goriva je: " + seat.natociGorivo(5));
        System.out.println();
        Auto fica = new Auto();
        fica.ime = "Mile";
        fica.prezime = "Lojpur";
        fica.marka = "Fica";
        fica.brojVrata = 2;
        fica.potrosnja = 8;
        fica.brzina = 90;
        fica.mesecRegistracije = 5;
        fica.kubikaza = 1500;
        fica.godinaProizvodnje = 1968;
        fica.trenutnaKolicinaGoriva = 30;
        fica.kapacitetRezervuara = 60;
        fica.stampa();

        System.out.println(fica.prekoracenje(100));
        System.out.println(fica.kazna(100) + " je kazna");
        fica.dodaj();
        fica.dodaj();
        fica.smanji();
        System.out.println("Trenutna brzina je: " + fica.brzina);
        System.out.println("Trenutna potrosnja je: " + fica.trenutnaPotrosnja());
        if (fica.oldTimer())
            System.out.println("Auto je old timer");
        else {
            System.out.println("Auto nije oldtimer");
        }
        if (fica.idteklaRegistracija(3))
            System.out.println("Auto je registrovan");
        else {
            System.out.println("Auto registrovan");
        }

        System.out.println("Cena registracije: " + fica.cenaRegistracije());
        System.out.println("Cena goriva je: " + fica.natociGorivo(5));
        System.out.println();
    }
}
