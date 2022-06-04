package Dan03_06Z1;

import java.util.ArrayList;

public class Kasa {
    private ArrayList<Dodatak> dodaci = new ArrayList<>();
    private ArrayList<Proizvod> proizvodi = new ArrayList<>();
    public void dodajProizvod(Proizvod proizvod){
        proizvodi.add(proizvod);
    }

    public Kasa() {
        this.dodaci.add(new Dodatak("piletina" , 100));
        this.dodaci.add(new Dodatak("junetina" , 200));
        this.dodaci.add(new Dodatak("cokolad" , 300));
        this.dodaci.add(new Dodatak("vanila" , 400));
        this.dodaci.add(new Dodatak("cokolada" , 100));
        this.dodaci.add(new Dodatak("jagoda" , 200));
        this.dodaci.add(new Dodatak("kecap" , 100));

    }
    public Dodatak nadji(String dodatak){
        for (int i = 0; i < this.dodaci.size(); i++) {
            if(this.dodaci.get(i).getNazivDodatka().equals(dodatak));
            return dodaci.get(i);
        }return null;
    }
    public double cenaPorudzbine(){
        double ukupnaCena = 0;
        for (int i = 0; i < this.proizvodi.size(); i++) {

            ukupnaCena += this.proizvodi.get(i).ukupnaCena();
    } return ukupnaCena;
    }
    public void stampajRacun(){
        for (int i = 0; i < this.proizvodi.size(); i++) {
            this.proizvodi.get(i).stampa();

        }
        System.out.println("Ukupno: " + cenaPorudzbine());
    }
}
