package Dan03_06Z2;

public class Main {
    public static void main(String[] args) {
        Lokal l1 = new Lokal("Obrenoviceva", 100, 1);
        Kuca k1 = new Kuca("Kraljevica Marka", 70, 2,5);
        Zgrada z1 = new Zgrada("Proleterska", 50, 2, 5);

        PoreskaUprava nis = new PoreskaUprava("Nis");
        nis.dodajObjekat(l1);
        nis.dodajObjekat(k1);
        nis.dodajObjekat(z1);
        nis.stampaj();
        System.out.println("Najveci porez");
        nis.najveciPorez().stampa();

    }
}
