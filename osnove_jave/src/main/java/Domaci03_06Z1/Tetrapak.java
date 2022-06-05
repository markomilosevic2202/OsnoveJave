package Domaci03_06Z1;

public class Tetrapak extends Ambalaza{
    private boolean mozeReciklaza;
    private double osnovnaCena;



    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean mozeReciklaza, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.mozeReciklaza = mozeReciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isMozeReciklaza() {
        return mozeReciklaza;
    }

    public void setMozeReciklaza(boolean mozeReciklaza) {
        this.mozeReciklaza = mozeReciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(mozeReciklaza){
            return this.tezinaPakovanja()*1.5 + this.osnovnaCena ;
        }
        return this.osnovnaCena;
    }

    @Override
    public void stampa() {
        System.out.println(this.barkod + " - " + this.nazivArtikla + " - " + " - " + this.osnovnaCena + " - " + this.cenaArtikla());
    }

}
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.