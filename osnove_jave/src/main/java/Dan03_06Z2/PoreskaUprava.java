package Dan03_06Z2;

import java.util.ArrayList;

public class PoreskaUprava {
    private String imeGrada;

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    private ArrayList<Objekat> objekti = new ArrayList<>();
     public void dodajObjekat(Objekat objekat){
         this.objekti.add(objekat);
     }

     public double ukupanPorez(){
         double ukupanPorez = 0;
         for (int i = 0; i < this.objekti.size(); i++) {
             ukupanPorez += this.objekti.get(i).porezObjekta();
         }
         return ukupanPorez;
     }
     public void stampaj(){
         for (int i = 0; i < this.objekti.size(); i++) {
             this.objekti.get(i).stampa();
         }
     }
     public Objekat najveciPorez(){
         int indeks= 0;
         for (int i = 0; i < this.objekti.size(); i++) {
             if(this.objekti.get(i).porezObjekta()> this.objekti.get(indeks).porezObjekta()){
                 return this.objekti.get(i);
             }

         }
         return this.objekti.get(indeks);
     }
}
