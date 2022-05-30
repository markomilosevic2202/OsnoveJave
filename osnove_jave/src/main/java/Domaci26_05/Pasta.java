package Domaci26_05;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> list= new ArrayList();

    public void dodaj(Sastojak sastojak){
        this.list.add(sastojak);
    }

    public Pasta() {
    }
    public double cena(){
       double cena = 0;
        for (int i = 0; i < list.size(); i++) {
            cena = cena + this.list.get(i).getCena();

        }
        return cena;
    }
    public void stampa(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Sastojak: " + this.list.get(i).getNaziv() + " Cena: " + this.list.get(i).getCena());
        }
        System.out.println("Cena paste je: " + cena());
    }
    public void brisiSastojak(Sastojak sastojak){
        for (int i = 0; i < list.size(); i++) {
            if (this.list.get(i).getNaziv().equals(sastojak.getNaziv()))
            list.remove(i);
        }

    }
}
