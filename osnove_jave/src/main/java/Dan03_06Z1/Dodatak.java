package Dan03_06Z1;

public class Dodatak {
    private String nazivDodatka;
    private int cena;

    public Dodatak() {
    }

    public Dodatak(String nazivDodatka, int cena) {
        this.nazivDodatka = nazivDodatka;
        this.cena = cena;
    }

    public String getNazivDodatka() {
        return nazivDodatka;
    }

    public void setNazivDodatka(String nazivDodatka) {
        this.nazivDodatka = nazivDodatka;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public void stampa(){
        System.out.println(this.nazivDodatka + " - " + this.cena);
    }
}
