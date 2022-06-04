package Dan03_06Z1;

import java.util.ArrayList;

public abstract class Proizvod {
    protected ArrayList<Dodatak> dodaci = new ArrayList<>();
     
    public void dodajDodatak(Dodatak dodatak){
        dodaci.add(dodatak);
    }
    public double cena(){
        double cena = 0;
        for (int i = 0; i < dodaci.size(); i++) {
            cena += this.dodaci.get(i).getCena();
        }
        return cena;
    }
    public abstract double ukupnaCena();
    public abstract void stampa();

    public ArrayList<Dodatak> getDodaci() {
        return dodaci;
    }

    public void setDodaci(ArrayList<Dodatak> dodaci) {
        this.dodaci = dodaci;
    }
}
