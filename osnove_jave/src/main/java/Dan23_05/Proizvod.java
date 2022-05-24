package Dan23_05;

public class Proizvod {
    private String naziv;
    private Kupac kupac;
    private int cenaIzrade;

    public Proizvod() {
    }

    public Proizvod(String naziv, Kupac kupac, int cenaIzrade) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }
    public double cenaProizvoda (){
        return (this.cenaIzrade * 1.9 * kupac.getKartica().getPopust())/100;
    }
    public void stampa(){
        System.out.println("Naziv: " + this.naziv + " - " + this.cenaProizvoda());
        System.out.println("Ime: " + this.kupac.getIme() + " Prezime: " + this.kupac.getPrezime() +
                           " - " + this.kupac.getKartica().getBrKartice());
    }
}
