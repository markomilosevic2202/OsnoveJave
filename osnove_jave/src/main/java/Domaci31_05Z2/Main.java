package Domaci31_05Z2;

public class Main {
    public static void main(String[] args) {
        Karton kratonCrveni = new Karton("crveni");
        Karton kartonZuti = new Karton("zuti");
        Igrac igrac1 = new Igrac("Milan Ilic", "451962656", 1987, 8, "Bek", true);
        igrac1.dodajKarton(kartonZuti);
        igrac1.dodajKarton(kartonZuti);
        igrac1.dodajKarton(kratonCrveni);
        igrac1.stampaj();
    }
}
