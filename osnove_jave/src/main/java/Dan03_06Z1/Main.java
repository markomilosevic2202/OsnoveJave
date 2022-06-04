package Dan03_06Z1;

public class Main {
    public static void main(String[] args) {
        Kasa k1 = new Kasa();
    Proizvod p1 = new Pica(100);
    p1.dodajDodatak(k1.nadji("kecap"));
    p1.dodajDodatak(k1.nadji("junetina"));
    k1.dodajProizvod(p1);
    k1.dodajProizvod(p1);
    k1.stampajRacun();

}
}