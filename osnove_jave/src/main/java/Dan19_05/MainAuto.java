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
        seat.stampa();
        System.out.println();

        Auto fica = new Auto();
        fica.ime = "Mile";
        fica.prezime = "Lojpur";
        fica.marka = "Fica";
        fica.brojVrata = 2;
        fica.potrosnja = 8;
        fica.brzina = 90;
        fica.stampa();

        System.out.println(fica.prekoracenje(100));
        System.out.println(fica.kazna(100) + " je kazna");
        fica.dodaj();
        fica.dodaj();
        fica.smanji();
        System.out.println("Trenutna brzina je: " + fica.brzina);
        System.out.println("Trenutna potrosnja je: " + fica.trenutnaPotrosnja());
    }
}
