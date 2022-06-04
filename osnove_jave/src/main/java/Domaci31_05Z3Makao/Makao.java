package Domaci31_05Z3Makao;

import java.util.ArrayList;

public class Makao {
    Spil s1 = new Spil();
    ArrayList<Igrac> igraci = new ArrayList<>();
    ArrayList<Karta> odigraneKarte = new ArrayList<>();
    int index ;

    public Makao(Spil s1) {
        this.s1 = s1;
        index = 0;
    }
    public void pristupiStolu(Igrac igrac){
        igraci.add(igrac);
    }
    public void podeliKarte(){
        for (int i = 0; i < this.igraci.size(); i++) {
            for (int j = 0; j < 6; j++) {
                this.igraci.get(i).dodajKartu(new Spil().random());
            }

        }
    }
    public void pomeriIndeks(){
        if(index<3){
            index++;
        }
        else {
            index = 0;
        }
    }
    public void stampaj(){
        for (int i = 0; i < this.igraci.size(); i++) {
            if(i==this.index){
                System.out.println("**********************************");
            }
            this.igraci.get(i).stampaj();
        }
        System.out.println("Zadnja karta: " );
        this.odigraneKarte.get(this.odigraneKarte.size()-1).stampa();
    }


}
