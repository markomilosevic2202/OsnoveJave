package Dan23_05;

public class MainFilReziser {
    public static void main(String[] args) {
        Reziser mile = new Reziser();
        mile.setIme("Mile");
        mile.setPrezime("Pandurovic");
        mile.setStarost(1948);
        mile.stampaj();

        Film oskar = new Film();
        oskar.setNaziv("Oskar");
        oskar.setGodina(2020);
        oskar.stampa();

    }
}
