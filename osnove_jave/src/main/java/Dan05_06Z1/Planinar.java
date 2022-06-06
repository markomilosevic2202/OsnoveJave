package Dan05_06Z1;

public abstract class Planinar {
    protected int idPlaninara;
    protected String imePrezime;

    public Planinar() {
    }

    public Planinar(int idPlaninara, String imePrezime) {
        this.idPlaninara = idPlaninara;
        this.imePrezime = imePrezime;
    }

    public int getIdPlaninara() {
        return idPlaninara;
    }


    public String getImePrezime() {
        return imePrezime;
    }

    public abstract void stampa();

    public abstract double cenaClanarine();

    public abstract boolean uspesanUspon(Planina planina);


}
//●	jedinstveni celobrojni identifikacioni broj
//●	ime i prezime
//Dok od javnih metoda:
//●	konstruktor koji postavlja sve atribute klase.
//●	gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
//●	apstraktnu metodu štampaj
//●	apstraktnu metodu koja vraca clanarinu planinara
//●	apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.
//(20 poena)