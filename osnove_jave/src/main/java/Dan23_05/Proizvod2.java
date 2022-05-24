package Dan23_05;

public class Proizvod2 {
    private int sifra;
    private String naziv;
    private double cenaPoKilogramu;

    public Proizvod2(int sifra, String naziv, double cenaPoKilogramu) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKilogramu = cenaPoKilogramu;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaPoKilogramu(double cenaPoKilogramu) {
        this.cenaPoKilogramu = cenaPoKilogramu;
    }
    public double getCenaKg(){
        return cenaPoKilogramu;
    }
    public double getCenaLb(){
       return this.cenaPoKilogramu * 2.2046;
    }
    public void stampa(){
        System.out.println("Sifra: " + this.sifra + " Naziv: " + this.naziv);


    }
}
