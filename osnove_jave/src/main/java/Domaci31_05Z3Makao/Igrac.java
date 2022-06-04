package Domaci31_05Z3Makao;

import java.util.ArrayList;

public class Igrac {
    private String imePrezime;
    private ArrayList<Karta> lista = new ArrayList<>();

    public Igrac(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public ArrayList<Karta> getLista() {
        return lista;
    }

    public void dodajKartu(Karta karta) {
        this.lista.add(karta);
    }

    public boolean jelPostoji(Karta karta) {
        boolean postoji = false;
        for (int i = 0; i < this.lista.size(); i++) {

            if (this.lista.get(i).getVrednostKarte() == karta.getVrednostKarte() &&
                    this.lista.get(i).getZnak().equals(karta.getZnak())) {
                postoji = true;
            }
        }return postoji;
    }
    public Karta odigrajKartu(int broj, String znak){
        Karta k1 = new Karta(broj, znak);
        Karta k2 = new Karta();
        for (int i = 0; i < this.lista.size(); i++) {
         if(k1.getVrednostKarte() == this.lista.get(i).getVrednostKarte() &&
             k1.getZnak().equals(this.lista.get(i).getZnak())){
             k2 = lista.get(i);
             this.lista.remove(i);
         }

        }
         return k2;
    }
    public void stampaj(){
        System.out.println(this.imePrezime);
        for (int i = 0; i < this.lista.size(); i++) {
            this.lista.get(i).stampa() ;
            System.out.println(", ");

        }
    }
}