package Dan19_05;

public class Auto {

    public String ime;
    public String prezime;
    public String marka;
    public int brojVrata;
    public int potrosnja;

    public String registracija;

    public boolean klima;

    public int brzina;

    public void stampa() {
        System.out.println(this.ime + " " + this.prezime);
        System.out.print(this.marka + "-" + this.brojVrata);
        System.out.println(" Sa potrosnjom od " + this.potrosnja + " l na 100km");
        System.out.println(this.brzina + " je trenutna brzina");
    }

    public boolean prekoracenje(int ogranicenje) {
        if (ogranicenje < this.brzina) {
            return true;
        }
        return false;

    }

    public int kazna(int ogranicenje) {
        int kazna = ((this.brzina - ogranicenje) * 1000);
        if (kazna > 0) {
            return kazna;
        }
        return 0;

    }

    public void dodaj() {
        brzina = brzina + 10;
    }

    public void smanji() {
        if (brzina < 10) {
            brzina = 0;
        } else {
            brzina = brzina - 10;
        }
    }

    public double trenutnaPotrosnja() {
        double trenutnaPotrosnja;
        if (klima) {
            return (this.brzina / 100 * potrosnja) * 1.2;
        }
        return (this.brzina / 100 * potrosnja);
    }


}
