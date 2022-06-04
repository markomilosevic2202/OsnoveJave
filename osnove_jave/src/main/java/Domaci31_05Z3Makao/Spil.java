package Domaci31_05Z3Makao;

import java.util.ArrayList;
import java.util.Random;
public class Spil {
    private Random randomGenerator;

    private ArrayList<Karta> spil1 = new ArrayList<>();

    public Spil() {
    }
    public void dodaj(Karta karta){
        this.spil1.add(karta);
    }
    public Karta random(){
        int index = randomGenerator.nextInt(spil1.size());
        this.spil1.remove(index);
        this.spil1.get(index).stampa();
        return this.spil1.get(index);
    }

}
