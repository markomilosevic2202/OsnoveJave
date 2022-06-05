package Domaci03_06Z1;

public class StaklenaAmbalaza extends Ambalaza {
    private double kaucija;
    private boolean placaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean placaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaKaucija = placaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaKaucija() {
        return placaKaucija;
    }

    public void setPlacaKaucija(boolean placaKaucija) {
        this.placaKaucija = placaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (placaKaucija) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }


    }

    @Override
    public void stampa() {
        System.out.println(this.barkod + " - " + this.nazivArtikla + " - " + " - " + osnovnaCena + " - " + this.cenaArtikla());
    }
}
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.