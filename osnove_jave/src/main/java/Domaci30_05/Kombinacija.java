package Domaci30_05;

import java.util.ArrayList;

public class Kombinacija {
    private String id;
    ArrayList<Integer> lista = new ArrayList();

    public Kombinacija(String id, int br1, int br2, int br3, int br4, int br5, int br6, int br7) {
        this.id = id;
        this.lista.add(br1);
        this.lista.add(br2);
        this.lista.add(br3);
        this.lista.add(br4);
        this.lista.add(br5);
        this.lista.add(br6);
        this.lista.add(br7);

    }

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public boolean provera(ArrayList<Integer> listaDobitna){
        int pogodak = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
               if(this.lista.get(j) == listaDobitna.get(i)) {
                 pogodak++  ;
               }
            }
        } if(7 == pogodak){
            return true;
        }
        else {return false;}
    }
    public void stampa(){
        System.out.println("Id kombinacije: " + this.id);
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.print(this.lista.get(i) + ", ");
        }
        System.out.println();
    }
}
