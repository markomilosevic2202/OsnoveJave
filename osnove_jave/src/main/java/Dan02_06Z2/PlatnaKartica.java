package Dan02_06Z2;

public abstract  class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godinaVazenja;
    protected int mesecVazenja;

    public PlatnaKartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaVazenja = godinaVazenja;
        this.mesecVazenja = mesecVazenja;
    }

    public PlatnaKartica() {
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaVazenja() {
        return godinaVazenja;
    }

    public int getMesecVazenja() {
        return mesecVazenja;
    }
    public void dodajSredstva(double dodajSredstva){
        this.suma = this.suma + dodajSredstva;
    }
    public void izvrsiTransakciju(double skiniSredstva){
        if(skiniSredstva > this.suma){
            this.suma = this.suma - skiniSredstva;}
        else {
            System.out.println("Nemate dovoljno sredstava ");
        }
    }
    public abstract void stampa();
}

