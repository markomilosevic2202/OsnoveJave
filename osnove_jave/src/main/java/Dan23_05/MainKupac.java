package Dan23_05;

public class MainKupac {
    public static void main(String[] args) {
        Kartica kartica1 = new Kartica(10,"457-254");
        Kupac kupac1 = new Kupac();
        kupac1.setIme("Marko");
        kupac1.setPrezime("Milosevic");
        kupac1.setKartica(kartica1);
        Proizvod proizvod1 = new Proizvod("Cipele", kupac1,1000);
        proizvod1.stampa();
    }
}
