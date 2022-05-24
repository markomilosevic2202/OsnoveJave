package Dan23_05;

public class Film {
    private String naziv;
    private int godina;

    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public Film() {

    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void stampa() {
        System.out.println("Naziv: " + naziv);
        System.out.println("Godina: " + godina);
    }
}
