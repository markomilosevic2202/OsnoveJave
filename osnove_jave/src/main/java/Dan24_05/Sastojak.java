package Dan24_05;

public class Sastojak {
    private String nazivSastojaka;
    private int cena;

    public Sastojak() {
    }

    public Sastojak(String nazivSastojaka, int cena) {
        this.nazivSastojaka = nazivSastojaka;
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getNazivSastojaka() {
        return nazivSastojaka;
    }

    public void setNazivSastojaka(String nazivSastojaka) {
        this.nazivSastojaka = nazivSastojaka;
    }
}
