package Domaci26_05;

public class Sastojak {
    private String naziv;
    private double cena;

    public Sastojak() {
    }

    public Sastojak(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public void stampa(){
        System.out.println(this.naziv + " - " + this.cena);
    }
}
