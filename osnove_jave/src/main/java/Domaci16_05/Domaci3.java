package Domaci16_05;

public class Domaci3 {
    public static void main(String[] args) {
        stampa("3006984730038", "Marko", "Milosevic", 1984, false);
    }


    static void stampa(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
        System.out.println("Jmbg: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God.rodjenja: " + godinaRodjenja);
        if (aktivan) {
            System.out.println("Aktivan");
        } else {
            System.out.println("Neaktivan");
        }
    }
}