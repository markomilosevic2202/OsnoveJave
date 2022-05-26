package Dan24_05;

public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;

    public Ugovor() {
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public void setProdavac(FizickoLice prodavac) {
        this.prodavac = prodavac;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    public double procenat(){
        if(this.kupac.getKupovao()){
            return 0.02;
        } else  {
           return 0.03;
        }
    }
    public double zarada(){
        return 1000+this.cena*this.procenat();
    }
    public void stampa(){
        System.out.print("Dan ugovora: " + this.datum);
        System.out.print("god sklopljen ugovor izmedju ");
        this.prodavac.stampa();
        System.out.print(" i ");
        this.kupac.stampa();
        System.out.print(" o kupovini nekretnine u ulici " +this.adresa +
                        " po ceni od " + this.cena + "pri cemu je kupac u obavezi da agenciji " +
                        "isplati novcanu vrednost u iznosu od " + zarada());




    }
}
