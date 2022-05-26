package Domaci24_05;

public class MainTransakcija {
    public static void main(String[] args) {
        Racun racin1 = new Racun("45-5546-332", "Marko Milosevci",1000);
        Racun racin2 = new Racun("32-5123-442", "Milan Karic",2000);
        Racun racin3 = new Racun("41-1122-352", "Dragan Sindjic",11000);
        racin3.stampa();
        Transakcija tr1= new Transakcija(4545, racin1,racin2);
        tr1.izvrsiTransakciju(955);
        tr1.stampaj();
        Transakcija tr2 = new Transakcija(4546,racin3,racin1);
        tr2.izvrsiTransakciju(10000);
        tr2.stampaj();
    }
}
