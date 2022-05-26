package Dan24_05;

public class MainUgovor {
    public static void main(String[] args) {
        FizickoLice kupac = new FizickoLice(154626856);
        kupac.setImePrezime("Marko Milosevic");
        kupac.setBrLicne(4522422);
        kupac.setKupovao(true);

        FizickoLice prodavac = new FizickoLice(145226864);
        prodavac.setImePrezime("Mile Dragic");
        prodavac.setBrLicne(1456655);
        prodavac.setKupovao(false);

       Ugovor ugovor1 = new Ugovor();
       ugovor1.setCena(35000);
       ugovor1.setAdresa("Stanoja glavasa");
       ugovor1.setDatum("14.05.2022");
       ugovor1.setKupac(kupac);
       ugovor1.setProdavac(prodavac);
       ugovor1.stampa();
    }
}
