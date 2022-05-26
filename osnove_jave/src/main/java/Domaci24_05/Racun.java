package Domaci24_05;

public class Racun {
    private String brRacuna;
    private String imePrezime;
    private double trenutnoStanje;

    public Racun(String brRacuna, String imePrezime, double trenutnoStanje) {
        this.brRacuna = brRacuna;
        this.imePrezime = imePrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void promenaStanja(double promena) {

            this.trenutnoStanje = this.trenutnoStanje - promena;


    }

    public void stampa() {
        System.out.println(this.imePrezime + " - " + this.brRacuna);
        System.out.println(this.trenutnoStanje + "rsd");
    }
}
