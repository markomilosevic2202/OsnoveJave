package Domaci02_06;

import java.util.ArrayList;

public abstract class Radnik {
    protected   String imePrezime;
    protected ArrayList<Sektor> list;

    public Radnik(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public abstract double plata();
    public void zaposliUSektoru(Sektor sektor){
        this.list.add(sektor);
    }
    public abstract void stampaj();

}
