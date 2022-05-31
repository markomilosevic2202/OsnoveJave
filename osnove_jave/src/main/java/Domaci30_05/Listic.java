package Domaci30_05;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> lista = new ArrayList<>();

    public void dodajKombinaciju(Kombinacija kombinacija){
        if (this.lista.size()<7){
        this.lista.add(kombinacija);}
        else {
            System.out.println("Nema vise mesta na listicu");
        }
    }
    public boolean proveraSvihKombinacija(Kombinacija dobitna){
        boolean dobitak = false;
        for (int i = 0; i < this.lista.size(); i++) {
            if(lista.get(i).provera(dobitna.lista)){
                dobitak = true;
            }


        } return dobitak;
    }
    public void stampa(){
        for (int i = 0; i < this.lista.size(); i++) {
            this.lista.get(i).stampa();
        }
    }
}
