package Dan02_06Z2;

public class MasterKartica extends PlatnaKartica {
    public MasterKartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja) {
        super(suma, brojKartice, godinaVazenja, mesecVazenja);
    }


    public void izvrsiTransakciju(double skiniSredstva) {
        super.izvrsiTransakciju(skiniSredstva);
        this.suma = this.suma - (skiniSredstva *  100 / 2);
    }


    public void stampa() {
        System.out.println("Master Card: " + this.mesecVazenja + "/" + this.godinaVazenja +
                this.brojKartice + " , " + this.suma);
    }
}
