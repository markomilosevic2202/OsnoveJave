package Dan03_06Z3;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tip;
    private ArrayList<Atleticar> atleticars = new ArrayList<>();

    public Disciplina(String imeDiscipline, String tip) {
        this.imeDiscipline = imeDiscipline;
        this.tip = tip;
    }

    public Disciplina() {
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    public void dodajDisciplinu(Atleticar atleticar){
        atleticars.add(atleticar);
    }
    public void diskvalifikuj(String imePrezime){
        for (int i = 0; i < this.atleticars.size(); i++) {
            if(this.atleticars.get(i).getImePrezime().equals(imePrezime)){
                this.atleticars.remove(i);
            }
        }

    }
    private Atleticar najbolji(){
        Atleticar najbolji = this.atleticars.get(0);
        for (int i = 0; i < this.atleticars.size(); i++) {
            if(najbolji.bolji(atleticars.get(i))){
                najbolji = this.atleticars.get(i);
            }
        }return najbolji;
    }
    public void prikaziNajboljeg(){
        System.out.println(najbolji().getImePrezime()); ;
    }
}
